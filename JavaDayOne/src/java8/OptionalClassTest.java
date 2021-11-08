package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalClassTest {
	public static void main(String[] args) {
		String[] str = new String[3];
		str[2] = "Sample";
		/*
		 * Optional<String> checkNull = Optional.ofNullable(str[2]); //To deal with
		 * empty values if (checkNull.isPresent()) System.out.println(str[2]); else
		 * System.out.println("Valus is not present!");
		 */
		//LambdaExpressionWay
		Optional.ofNullable(str[2]).ifPresent(s->System.out.println(s.toUpperCase()));
		
		/*
		 * Map<String,String> hashmap = new HashMap<String,String>(); hashmap.put(new
		 * String("a"),"audi");
		 */
	}
}
