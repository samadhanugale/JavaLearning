package java8;

import java.util.Arrays;

public class ParallalArraySortingTest {

	public static void main(String[] args) {
		int numbers[]= {12,43,21,54,55,75,26,28,1,4,94,10,8,73};
		//Parallal sort method for sorting array
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(System.out::println);
		
		
		int numbers2[]= {12,43,21,54,55,75,26,28,1,4,94,10,8,73};
		//Parallal sort method for sorting array
		Arrays.parallelSort(numbers2,7,13);
		Arrays.stream(numbers2).forEach(n->System.out.print(n+" "));
	}

}
