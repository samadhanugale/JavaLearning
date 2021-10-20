package map.function;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;


public class MapWordDictionary {
	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>(); //Alows key value pair
		dictionary.put("Honda", "Honda Bikes have two wheels and they woeks on petrol driven engines");
		dictionary.put("Hero", "Hero bikes are good");
		dictionary.put("Maruti", "They have much types of cars");
		dictionary.put(null, "some Text");//it is in the key value pair
		dictionary.put("alert", null);//multiple null values are allowed
		dictionary.put("upload", null);//Single null key allowed
		//System.out.println(dictionary);
		
		String meaning = dictionary.get("Hero");
		
		if(meaning==null) {
			System.out.println("Word not found!");
		}
		else {
			System.out.println(meaning);
		}
		
		Set<String> keys = dictionary.keySet(); //Set of keys
		System.out.println(keys);
		
		Collection<String> val = dictionary.values();//Set of values
		System.out.println(val);
		
		
		System.out.println("\n Map via Entry : Iterator");
		for (Map.Entry<String, String> entry : dictionary.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println("------------");
		    System.out.println("Key : "+key);
		    System.out.println("Value : "+value);
		    
		    // ...
		}
	}
}
