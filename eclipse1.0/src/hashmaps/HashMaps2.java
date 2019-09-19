package hashmaps;

import java.util.HashMap;

public class HashMaps2 {
	public static void main(String[] args) {
		
		HashMap <String,String> fun = new HashMap<String,String>();
		
		
		fun.put("bobs", "noWorld");
		fun.put("margarot", "DarKSun");
		fun.put("nancy", "Barcelona");
		
		
		// Remove elements inside a HashMap
		
		fun.remove("bobs");
		
		System.out.println(fun);
		System.out.println();
		
		// See if a HashMap contains a certain Value 
		
		System.out.println(fun.containsValue("123"));
		System.out.println();
		
		
		// See if a HashMap contains a certain Key
		
		System.out.println(fun.containsKey("nancy"));
		
		//size
		
		System.out.println(fun.size());
		System.out.println();
		
		//replace 
		
		fun.replace("margarot","GoodDay");
		System.out.println(fun);
		
		
		
		
	}

}
