package map.function;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeKeyValue {
	public static void main(String[] args) {
		Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>(); 
		dictionary.put(6450, 10000);
		dictionary.put(6451, 11000);
		dictionary.put(6452, 14000);
		dictionary.put(6453, 12000);
		dictionary.put(6454, null);
		dictionary.put(6455, 15000);
		System.out.println(dictionary);
		
		double meaning = dictionary.get(6450);
		if(meaning==0) {
			System.out.println("Match not found!");
		}
		else {
			System.out.println(meaning);
		}
		
		Set<Integer> keys = dictionary.keySet(); //Set of keys
		System.out.println(keys);
		
		Collection<Integer> val = dictionary.values();//Set of values
		System.out.println(val);
		
		
		System.out.println("\n Map via Entry : Iterator");
		for (Map.Entry<Integer, Integer> entry : dictionary.entrySet()) {
		    int key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println("------------");
		    System.out.println("Employee ID : "+key);
		    System.out.println("Salary : "+value);
		    
		    // ...
		}
	}
}
