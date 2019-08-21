package threads;

import java.util.Random;

/**
 * Threads is a way that our computer allows us to do
 * many things at once. 
 * 
 * 
 */


// implements the run method 
// in the runnable interface 
public class Sub1 implements Runnable {
	
	String name;
	int time;
	
	Random rd = new Random();
	
	
	//constructor
	public Sub1(String x) {
		name = x;
		time = rd.nextInt(999);
		
	}
	
	// whatever we put in try our code that runs
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n",name,time);
			Thread.sleep(time); // random time that we did before
			System.out.printf("%s is done \n",name);
			
			
		}catch(Exception e) {
			
		}
	}
	
}
