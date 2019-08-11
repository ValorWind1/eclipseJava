package ArrayList;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		
		
		//Normal ARRAY 
		
		String [] moons  = new String[3];
		
		moons[0] = "Europa";
		moons[1] = "Moon";
		moons[2] = "titan";
		System.out.println(moons[0]);
				
	
		
		//Array List 
		
		ArrayList<String> moonsList = new ArrayList<String>();
		
		moonsList.add("Europa");
		moonsList.add("Moon");
		moonsList.add("Titan");
		moonsList.add("Triton");
		
		
		System.out.println(moonsList);
		
		//Remove elements 
		moonsList.remove("Titan");
		System.out.println(moonsList);
		
		// Conclusion Array lists are much more easier, flexible 
		//arrays are better for smaller things 
		
	}

}
