package speedWeek3;

public class speed7 {
    public static void main(String[] args){
       
    	
    	Classb obj = new Classb();
        
        // thread to begin execution
        obj.start();
 
        synchronized(obj){
            try{
                System.out.println("sync the b ");
                
                // Causes the current thread to wait until it is awakened
                obj.wait();
            
            }catch(InterruptedException e){
            	e.printStackTrace();
            }
 
            System.out.println("the sum :  " + obj.total);
        }
    }
}

// EXTENDS

class Classb extends Thread{
    	
	int total;
     
    @Override
    public void run(){
        
    	synchronized(this){
            
    		
    		for(int i=0; i<500 ; i++){
                
    			//
    			
    			total += i;
            
    		}
            // Wakes up a single thread that is waiting on this object's
    		notify();
        }
    }
}
