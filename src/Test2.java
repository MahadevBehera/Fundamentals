
public class Test2 {

	public static void main(String[] args) {
		new Hello().m2();
		byte b =10;
		new Hello().add(b, 10);
		
	}

}

class Hello{
	Hello(){
//		this(); // compile time error recursive constructor invocation
//		this(10); // compile time error recursive constructor invocation
	}
	
	Hello(int a){
		this();
	}
	static{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	void m1() {
		System.out.println("m1");
	}
	
	static void m2() {
		System.out.println("m2");
	}
	
	static void m2(int a) {
		System.out.println("m2");
	}
	
	int add (int a, byte b) {
		return a+b;
	}
	
	int add (byte s , int b) {
		return s+b;
	}
}
