package speed7;

import java.util.Scanner; 

class Assertion
{ 
    public static void main( String args[] ) 
    { 
    	Scanner sc = new Scanner(System.in);
    	
    	int n  ; 
    		
    	System.out.println("type ur age");
    	n = sc.nextInt();
    	 
        System.out.println(" ur age is : "+n); 
        
        	
    } 
    
    public static void checkID(int n) {
    	if (n >= 21) {
    		assert n >= 21 : " Underage"; 
    		
    	}else {
    		System.out.println("drink");
    	}
    	
    }
} 