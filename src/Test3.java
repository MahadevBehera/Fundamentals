
public class Test3 {
 volatile int a =10;
	synchronized public static void main(String[] args) {
		
	}

}

class A1{
	
	synchronized A1 m() {
		System.out.println("A1");
		return new A1();
	}
}

class B1 extends A1{
	
	synchronized B1 m() {
		System.out.println("B1");
		return new B1();
	}
	
}
