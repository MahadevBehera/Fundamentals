
public class Test1 {

	public static void main(String[] args) {
		new Soap().m();
		System.out.println("************************");
		((Product)new Soap()).m();
	}

}

class Product {
	
	{
		System.out.println("IIB Product");
	}
	public static void m() {
		System.out.println("Product");
	}
}

class Soap extends Product{
	{
		System.out.println("IIB Soap");
	}
	public static void m() {
		System.out.println("Soap");
	}
}
