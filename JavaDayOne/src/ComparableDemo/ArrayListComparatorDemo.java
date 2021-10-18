package ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

public class ArrayListComparatorDemo {
	public static void main(String[] args) {
		Book b1 = new Book(11, "Java", "JavaAuthor", 20);
		Book b2 = new Book(22, "Python", "PythonAuthor", 30);
		Book b3 = new Book(33, "CPP", "CPPAuthor", 40);
		Book b4 = new Book(66, "IOT", "IOTAuthor", 50);
		Book b5 = new Book(55, "OOP", "OopAuthor", 60);
		Book b6 = new Book(44, "DataStructure", "DsAuthor", 70);
		Comparator<Book> compare = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Compare by ID \n 2. Compare by Name \n 3. Compare by Author \n 4. Compare By Price");
		int tmp = sc.nextInt();
		sc.close();
		switch (tmp) {
		case 1:
			compare = new CompareById();
			break;
		case 2:
			compare = new CompareByName();
			break;
		case 3:
			compare = new CompareByAuthor();
			break;
		case 4:
			compare = new CompareByPrice();
			break;
		default:
			System.out.println("Invalid Choice!");

		}

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);
		bookList.add(b6);

		System.out.println("----------- Using For Each ------------------");
		for (Book books : bookList) {
			System.out.println(books);

		}
		Collections.sort(bookList, compare);
	}
}
