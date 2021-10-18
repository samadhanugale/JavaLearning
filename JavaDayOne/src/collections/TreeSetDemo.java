package collections;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import demo.books.Book;

public class TreeSetDemo {
	public static void main(String[] args) {
		Book b1 = new Book(11, "Java", "JavaAuthor", 20);
		Book b2 = new Book(22, "Python", "PythonAuthor", 30);
		Book b3 = new Book(33, "CPP", "CPPAuthor", 40);
		Book b4 = new Book(66, "IOT", "IOTAuthor", 50);
		Book b5 = new Book(55, "OOP", "OopAuthor", 60);
		Book b6 = new Book(44, "DataStructure", "DsAuthor", 70);

		Set<Book> bookSet = new TreeSet<Book>();
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
