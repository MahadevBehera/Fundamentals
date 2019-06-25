
public class Test4 {
	final int a;
	
	Test4(){
		this.a= 10;
	}
	
	
	public static void main(String[] args) {
		Y y = new Y();
		y.m1();
		String s1 = new String("abc")+ new String("def");
		String s2 = "abc"+ new String("def");
		String s3 = "abc"+"def";
		String s4 = new String("abcdef");
		String s5 = "abcdef";
		
		System.out.println(s1 == s2); //false
		System.out.println(s2 == s3); //false
		System.out.println(s3 == s4); //false
		System.out.println(s4 == s5); //false
		System.out.println(s1 == s3); //false
		System.out.println(s1 == s4); //false
		System.out.println(s1 == s5); //false
		System.out.println(s2 == s4); //false
		System.out.println(s2 == s5); //false
		System.out.println(s3 == s5); //true
		
		Test4 t = new Test4();
		System.out.println(t.a);
		int x = 1;
		System.out.println("******************");
		System.out.println(~x);
		System.out.println(~x >> x);
		System.out.println(x);
		System.out.println(0x000f & 0x2222);
	}

}


interface In1{
	default void m1() {
		
	}
}

interface In2{
	default void m1() {
		
	}
}

class XYZ{
	public void m1() {
		
	}
}

class Y extends XYZ implements In1, In2{
//	public void m1() {
//		In1.super.m1();
//	}
}

class Dev{
	void m() {
		
	}
}

class Dev1 extends Dev{
	void m() {
		
	}
}

class Dev2 extends Dev1{
	void m() {
		super.m();
	}
}

