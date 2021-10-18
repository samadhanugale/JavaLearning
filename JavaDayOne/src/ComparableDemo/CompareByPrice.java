package ComparableDemo;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getPrice()-b2.getPrice();
	}

}
