package hashmaps;

import java.util.HashMap;

public class hash {

	
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> sad = new HashMap<String,Integer> ();
		
		sad.put("a",10);
		sad.put("b",20 );
		sad.put("c",30 );
		
		System.out.println(sad);
		System.out.println(sad.get("a"));
	}
	

}
