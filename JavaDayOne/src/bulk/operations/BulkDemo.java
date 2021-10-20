package bulk.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkDemo {
	public static void main(String[] args) {
		Integer arr1[] = {10,20,30,40,50,60,70,80,90};
		List<Integer> lst1 = Arrays.asList(arr1);
		System.out.println(lst1);
		
		List<Integer> lst2 = new ArrayList<>();
		lst2.add(33);
		lst2.add(43);
		lst2.add(32);
		lst2.add(54);
		lst2.add(433);
		System.out.println("List 2 : "+lst2);
		List<Integer> lst3 = new ArrayList<>();
		lst3.add(122);
		lst3.add(123);
		lst3.add(321);
		System.out.println("initial List 3 : "+lst3);
		System.out.println("Added lst2 in lst3");
		lst3.addAll(lst2);
		System.out.println("List 3 : "+lst3);
		
//		System.out.println("List 3 : "+lst3);
//		lst3.retainAll(lst2); //Commons retained
//		System.out.println("Retained list 3 : "+lst3);
		
		lst3.removeAll(lst2);
		System.out.println("List 2 removed from list 3 : "+lst3);
	}
}
