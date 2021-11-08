package java8;

import java.util.StringJoiner;

public class StringJoinerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner stringjoiner = new StringJoiner("-", "|=|", "|=|");
		stringjoiner.add("abcd");
		stringjoiner.add("asdf");
		stringjoiner.add("lkjh");
		System.out.println(stringjoiner);
		
		
		StringJoiner stringjoiner2 = new StringJoiner(":", "[", "]");
		stringjoiner2.add("abcd");
		stringjoiner2.add("asdf");
		stringjoiner2.add("lkjh");
		System.out.println(stringjoiner2);
		System.out.println(stringjoiner.merge(stringjoiner2));
		System.out.println(stringjoiner2.length());
		System.out.println(stringjoiner2.toString().charAt(3));
	}

}
