package com.neosoft;

public class HasATest {

	public static void main(String[] args) {
		
		Author sarwar=new Author("sarwar", 23, "pune");
		Author sahil=new Author("sahil", 25, "mumbai");
		
		Publisher himalya= new Publisher("Himalya", "Noida");
		Publisher vision=new Publisher("Vision", "Navi mumbai");
		
		Book javabook=new Book("java basics", 100, sarwar, himalya);
		Book phpbook=new Book("php basics", 100, sahil, vision);
		Book springbook=new Book("Spring Basics",199,sarwar,himalya);
		Book jsbook=new Book("jsp Basics", 110, sahil, vision);
		
		
		
		
		
		
		
		/*
		 * System.out.println("Java author place:"+javabook.author.place);
		 * System.out.println("Java publisher name:"+javabook.publisher.pub_city);
		 * 
		 * 
		 * System.out.println("PHP author place:"+phpbook.author.place);
		 * System.out.println("PHP publisher name:"+phpbook.publisher.pub_city);
		 */
		
		//Display book name and author name published by vision
       Book[] library= {javabook,phpbook,springbook,jsbook};
		
		for(Book book2: library)
		{
			if(book2.publisher.pub_name=="Vision") {
				System.out.println("Book Name:"+book2.book_name);
				System.out.println("Author Name:"+book2.author.author_name);
	    }
 }

	}

}

class Author{
	String author_name;
	int age;
	String place;
	public Author(String author_name, int age, String place) {
		super();
		this.author_name = author_name;
		this.age = age;
		this.place = place;
	}
}

//Relation with author and publisher(Has-a)
class Book{
	String book_name;
	double price;
	Author author;
	Publisher publisher;
	public Book(String book_name, double price, Author author, Publisher publisher) {
		super();
		this.book_name = book_name;
		this.price = price;
		this.author = author;
		this.publisher = publisher;
	}
}

class Publisher{
	String pub_name;
	String pub_city;
	public Publisher(String pub_name, String pub_city) {
		super();
		this.pub_name = pub_name;
		this.pub_city = pub_city;
	}
}
