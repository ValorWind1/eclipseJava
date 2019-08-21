package threads;

public class ThreadsSync {
	
	
	// two threads that access the same method , or data field
	// if they access at the same time it will obtain not accurrate result 
	
	private int balance = 0 ; 
	
	
	
	public static void main(String[] args) {
		
		ThreadsSync ts = new ThreadsSync();
		ts.goingThroughLife();
		
		
	}
	public void goingThroughLife() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000000;i++) {
					add();
				}
				
				
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000000;i++) {
					substract();
				};
				
			}
			
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Balance: "+balance);
		
		
	}
	
	public synchronized void add() {
		balance++;
	}
	public synchronized void substract() {
		balance --;
	}
	

}
