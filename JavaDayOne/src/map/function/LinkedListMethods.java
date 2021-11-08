package map.function;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListMethods {
	public static void main(String[] args) {
		Deque<String> list = new LinkedList<String>();

		list.add("Car");
		list.add("Bike");
		list.add("Aeroplane");
		list.add("Ship");
		list.add("Drone");

		System.out.println("LinkedList:" + list);

		// Remove the head using removeFirst() method
		System.out.println("The first element is: " + list.removeFirst());

		// Displaying the final list
		System.out.println("Final LinkedList:" + list);

		// Remove the Tail using removeLast() method
		System.out.println("The Last element is: " + list.removeLast());

		// Displaying the final list
		System.out.println("Final LinkedList:" + list);

		// AddFirst
		list.addFirst("FirstElement");
		System.out.println("Final LinkedList:" + list);

		// AddLast
		list.addLast("LastElement");
		System.out.println("Final LinkedList:" + list);
		
		list.descendingIterator();
		System.out.println(list);
	}
}
