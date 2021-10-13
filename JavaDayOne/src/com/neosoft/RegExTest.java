package com.neosoft;
import java.util.regex.*;
public class RegExTest {
	public static void main(String[] args) {
		
		//1st Way
		Pattern pattern = Pattern.compile(".a"); // . means any single character before s
		Matcher matcher = pattern.matcher("ba");
		boolean result =  matcher.matches();
		System.out.println(result);
		
		//2nd way
		boolean res = Pattern.compile(".a").matcher("ba").matches();
		System.out.println(res);
		
		//3rd way
		boolean rs = Pattern.matches("..x","aax"); //single . Matches only single character
		System.out.println(rs);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d{2,10}","12333")); // \\d = [0-9]
		System.out.println(Pattern.matches("\\w{4,7}","a23"));
		System.out.println(Pattern.matches("[0-9]{1,4}","00"));
		System.out.println(Pattern.matches("[0-5]{1,4}","07"));
		
		System.out.println(Pattern.matches("\\s"," "));
		System.out.println(Pattern.matches("[a-c]{3}","abcd"));
		
		
		//4th way
		
		String str = "Its nice we are learning Java here";
		String exp = ".*(java|Java).*";
		System.out.println(str.matches(exp));
		
		System.out.println("9881182269".matches("\\d{10}"));
		
		String mobileNo = "+91-9552505659";
		System.out.println("Mobile No : "+"+91-9552505659".matches("^[+]{1}[\\d]{1,3}[-]{1}[0-9]{10}"));
	}
}
