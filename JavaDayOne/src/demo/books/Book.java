package demo.books;

public class Book implements Comparable<Book> {
	private int bookId;
	private String bookName;
	private String author;
	private int price;

	public Book(int bookId, String bookName, String author, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Id : "+bookId+"\n"+" Book Name : "+bookName+"\n Book Author : "+author+"\n Book Price : "+price;
	}
	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		System.out.println("In Compare to Method");
		return this.bookId-book.bookId;
	}

}
