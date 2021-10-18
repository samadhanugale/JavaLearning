package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		// Set<String> nameSet = new TreeSet<String>();
		// Tree Set is sorted and it dont allows null
		System.out.println(nameSet);
		nameSet.add("Sagar");
		nameSet.add("Pratiksha");
		nameSet.add("Vishal");
		nameSet.add("Sagar");
		nameSet.add("Adesh");// Can't access via index
		nameSet.add("Sagar");
		nameSet.add(null);// Nulls are allowed
		System.out.println(nameSet);// this is case sensative, Overrides duplications
		System.out.println(nameSet.isEmpty());

		// Enhanced for
		for (String name : nameSet) {
			System.out.println(name);
		}
		// Enhanced for with lambda
		System.out.println("enhanced for with Lambda");
		nameSet.forEach(name1 -> System.out.println(name1));

		Iterator<String> ire1 = nameSet.iterator();
		while (ire1.hasNext()) {
			// System.out.println(ire1.hasNext());
			if (ire1.equals("Adesh")) {
				ire1.remove();
			}

			ire1.next();
		}
		System.out.println(nameSet);

		ArrayList<String> nameList = new ArrayList<>();
		System.out.println(nameList);
		nameList.add("Sagar");
		nameList.add("Pratiksha");
		nameList.add("Vishal");
		nameList.add("Sagar");
		nameList.add("Adesh");// can be accessed via index
		nameList.add("Sagar");

		nameList.add(2, "Sam");
		nameList.add(null);// Nulls are allowed
		System.out.println(nameList);// null pointer exception occure if comparing

		// Normal For loop
		for (int i = 0; i < nameList.size(); i++) {
			String name = nameList.get(i);
			System.out.println(name);
		}

		// forEach
		System.out.println("ForEach ArrayList");
		nameList.forEach(nm -> System.out.println(nm));

		System.out.println("--- List Iterator ---");
		System.out.println("-----Forward--------");
		ListIterator<String> litr = nameList.listIterator();
		while (litr.hasNext()) {
			int index = litr.nextIndex();
			if (index == 3) {
				litr.add("Poonam");
			}

			String nme = litr.next();
			if (nme == null) {
				litr.set("FilledSpace");
			}
			System.out.println(nme);

		}

		System.out.println("--- Backword---");
		while (litr.hasPrevious()) {
			String nem = litr.previous();
			System.out.println(litr.previousIndex());
			System.out.println(nem);

		}
		Set nt = new TreeSet<String>();
		nt.add("TreeObj1");
		nt.add("TreeObj2");
		nt.add("TreeObj4");
		nt.add("TreeObj3");
		
		nt.forEach(nn->System.out.println(nn));

	}
}
