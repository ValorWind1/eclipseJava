package hashmaps;

import java.util.HashMap;

public class HashMaps1 {

	public static void main(String[] args) {
		
		// HashMaps : Nothing more than a list of keys and values.
		
//		int a = 10;   //SO INSTEAD OF DOING THIS WE CAN DO HASHMAPS FOR alot of of values,keys
//		int b = 20;
//		int c = 30;

		
		HashMap <String, Integer>happy = new HashMap<String, Integer>(); // LEFT SIDE = KEY(NAME) 
		happy.put("a",10);												// RIGHT SIDE = VALUE
		happy.put("b",20);
		happy.put("c",30);
		
		System.out.println(happy);
		System.out.println();
		System.out.println(happy.get("b"));
		
		
		
		

	}

}
