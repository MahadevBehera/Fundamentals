
public class ThreadLogic1 implements Runnable{
	static int count = 0;
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadLogic1());
		t.start(); //Thread-0
		t.run(); //main
		t.join(); //t ---> main
		t.run(); // main (Not executed ... why ?)
		//t.run(); //(Not executed ... why ?)
		System.out.println(count+"  "+t.getName());
	}
	@Override
	public void run() {
		System.out.println("********** run() ********** "+Thread.currentThread().getName());
		for (int i = 0; i < 4; i++) {
			count++;
			System.out.println("************ count ***********"+count);
		}
	}

}
