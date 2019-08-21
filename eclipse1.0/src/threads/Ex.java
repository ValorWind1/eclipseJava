package threads;

public class Ex {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Sub1("one"));
		Thread t2 = new Thread(new Sub1("two"));
		Thread t3 = new Thread(new Sub1("three"));
		Thread t4 = new Thread(new Sub1("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start(); // start run the run() , method
		
		
	}

}
