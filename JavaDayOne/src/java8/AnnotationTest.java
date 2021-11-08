package java8;

import java.util.ArrayList;
import java.util.Date;
public class AnnotationTest {
	@SuppressWarnings({ "unchecked", "rawtypes","deprecation" }) // skipping warnings
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Child().show();

		ArrayList a = new ArrayList();
		a.add("asd");
		a.add("qwe");
		a.add("tew");
		a.add("rewr");
		a.add("asvsdfd");
		System.out.println(a);
		System.out.println(new Date().getHours());
		System.out.println(new Date().getMinutes());
		
		new check().show(); //Deprecated Method can be removed in further versions
	}

	class Parent {
		public void show() {
			System.out.println("This is parent method");
		}
	}

	class Child extends Parent {
		@Override
		public void show() {
			System.out.println("Child Method");
		}
	}
}
class check{
	@Deprecated
	void show() {
		System.out.println("show");
		
	}
}
