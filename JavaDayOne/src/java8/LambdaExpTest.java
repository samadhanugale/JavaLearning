package java8;


@FunctionalInterface
interface Sample{
	public void show();
}

@FunctionalInterface
interface Sample1{
	public void show1(String msg, String name);
}
@FunctionalInterface
interface Addition{
	
	public int add(int n1,int n2,int n3);
}
public class LambdaExpTest {
	public static void main(String[] args) {
		String str = "Welcome";
		Sample s = () ->{
			System.out.println("Message : "+str);
		};
		s.show();
		
		Sample1 s1 =(msg,name) ->{
			System.out.println("Message : "+msg+" "+name);
		};
		s1.show1("Welcome Here","samadhan");
		
		Addition as = (n1,n2,n3) ->n1+n2+n3;
		System.out.println("Addition : "+as.add(12, 13, 14));
		
		LambdaExpTest object = new LambdaExpTest();
		MathOperation add = (int a, int b) -> a+b;
		MathOperation sub = (int a, int b) -> a-b;
		MathOperation mul = (int a, int b) -> a*b;
		MathOperation div = (int a, int b) -> a/b;
		
		System.out.println("100 + 20 = "+add.operation(100, 20));
		System.out.println("100 - 20 = "+object.opert(100, 20, sub));
		System.out.println("100 * 20 = "+object.opert(100, 20, mul));
		System.out.println("100 / 20 = "+object.opert(100, 20, div));
	}
	
	
	
	@FunctionalInterface //Inside the class
	interface MathOperation{
		int operation(int a,int b);
	}
	
	private int opert(int a,int b, MathOperation mathOperation) {
		return mathOperation.operation(a,b);
	}
}
