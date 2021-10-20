package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
	}
}
