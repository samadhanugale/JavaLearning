package ComparableDemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {
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
		switch(tmp) {
		case 1 :
			compare = new CompareById();
			break;
		case 2 :
			compare = new CompareByName();
			break;
		case 3 :
			compare = new CompareByAuthor();
			break;
		case 4 :
			compare = new CompareByPrice();
			break;
			default:
				System.out.println("Invalid Choice!");
			
		}
		Set<Book> bookSet = new TreeSet<Book>(compare);
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		bookSet.add(b6);

		System.out.println("----------- Using For Each ------------------");
		for (Book books : bookSet) {
			System.out.println(books);
			/*
			 * if (books.getBookId() == 22) { System.out.println("This is imp book!");
			 * System.out.println(books);
			 * 
			 * }
			 */
		}

		System.out.println("------------- Using Iterator ---------------");
		Iterator<Book> itr = bookSet.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			System.out.println(book);
		}

	}

}
