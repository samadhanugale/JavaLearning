package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface DefaultAndStaticShow{
	default void showMessage() {
		System.out.println("Default message from default method");
	}
	static void showMsgStatic() {
		System.out.println("Static method message");
	}
	void show(String msg);
}
public class DefaultMethodShow implements DefaultAndStaticShow{

	@Override
	public void show(String msg) {
		System.out.println("Message is : "+msg);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodShow obj = new DefaultMethodShow();
		obj.show("ObjMessage"); //abstract implementation method call
		obj.showMessage(); //default method call
		
		DefaultAndStaticShow.showMsgStatic(); //Static method call from interface
		
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,23,34,45,67));
			list.forEach(System.out::println);
	}

	
	

}
