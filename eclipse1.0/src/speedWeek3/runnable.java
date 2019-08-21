package speedWeek3;

public class runnable implements Runnable {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("");
        runnable runnable = new runnable();

        System.out.println("");
        Thread thread = new Thread(runnable);

        System.out.println("Started");
        thread.start();
        
        
        
        
    }

    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
        
        for(int i = 0;i < 10;i ++) {
			System.out.println("Thread "+ Thread.currentThread().getId()+": "+i);
    }
}
    
    public void display (String n) {
    	synchronized(this) {
    		{ 
                System.out.println(": " + n ); 
                try 
                { 
                    Thread.sleep(1000); 
                }  
                catch (Exception e)  
                { 
                    System.out.println("Thread : ."); 
                } 
                System.out.println("\n" + n + ": "); 
            } 
        } 
    } 
    	
    }
