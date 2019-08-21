package arraylist1_0;

import java.util.ArrayList;

public class ArrayList1_0 {

	public static void main(String[] args) {
		
		
	ArrayList ar1 = new ArrayList();
	
	ar1.add("mango");
	ar1.add("apple");
	ar1.add("Strawberry");
	ar1.add("Watermelon");
	
	System.out.println(ar1);
	System.out.println();
	
	// Delete an object
	ar1.remove("apple");
	System.out.println(ar1);
	System.out.println();
	
	
	// clear everything 
	ar1.clear();
	System.out.println(ar1);
	
	

	}

}
