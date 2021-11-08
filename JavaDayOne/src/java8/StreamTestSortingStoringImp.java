package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestSortingStoringImp {
	public static void main(String[] args) {
		List<Mobile> mobiles = new ArrayList<Mobile>();
		mobiles.add(new Mobile(11, 1000, "iphone"));
		mobiles.add(new Mobile(12, 1200, "samsung"));
		mobiles.add(new Mobile(13, 1800, "xiaomi"));
		mobiles.add(new Mobile(14, 1600, "oneplus"));
		
		List<String> mobileNames = mobiles.stream()
				.filter(element -> element.price>=1200)
				.map(element -> element.name) //Fetch Names only
				.collect(Collectors.toList()); //Function chaining
		System.out.println(mobileNames);
		
		mobiles.stream().filter(element -> element.price>=1200).forEach(element ->System.out.println(element.name));
		
		
		//Max price
		Mobile m1 = mobiles.stream().max((mob1,mob2)->mob1.price>mob2.price ? 1:-1).get();
		System.out.println("Max Price : "+m1.price);
		
		
		
		//Min price	
		Mobile m2 = mobiles.stream().min((mob1,mob2)->mob1.price>mob2.price ? 1:-1).get();
		System.out.println("Min Price : "+m2.price);
		
		
		//counting no of phones having price greater than
		long countt = mobiles.stream().filter(element -> element.price>=1500).count();
		System.out.println( "Number of Mobiles having price more than 1500 : "+countt);
		
		Set<Double> mobilePrice = mobiles.stream().filter(element -> element.price>1100)
				.map(element->element.price)
				.collect(Collectors.toSet());
				
				System.out.println(mobilePrice);
				
				
				
		mobiles.clear();
		
		//Using Method Referancing
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(new Phone(11, "Hitachi",1000));
		phones.add(new Phone(12, "LG",1200));
		phones.add(new Phone(13, "Nokia",1400));
		phones.add(new Phone(14, "Karbon",1600));
		phones.add(new Phone(15, "Toshiba",1800));
			
		
		List<String> phoneNames = phones.stream()
				.map(Phone::getName) //Fetch Names only
				.collect(Collectors.toList()); //Function chaining
		System.out.println(phoneNames);
		
		//Sort names after filtering
		phones.stream().filter(phone ->phone.getPrice()<1300)
			.sorted((phone1,phone2)->phone1.getName().compareTo(phone2.getName()))
			.forEach(phone->System.out.println(phone.getName()));
				
		phones.clear();
	}
}


class Phone{
	private int id;
	private String name;
	private double price;
	public Phone(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}