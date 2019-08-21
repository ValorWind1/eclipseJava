package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
	//set interface
	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();
		
		// set = hashset = hashing = heap memory 
		
		// set = not in a normal sequence
		
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(7);
		values.add(3);
		
		for(int i:values){
			System.out.println(i);
			System.out.println("-----------");
			
//		Set<Integer> valuesi = new TreeSet<>();	
//		
//		// Tresset follows sequence
//		// ascending order 
//		valuesi.add(5);
//		valuesi.add(6);
//		valuesi.add(7);
//		valuesi.add(7);
//		valuesi.add(3);
//			
//			for(int y:valuesi) {
//				System.out.println(y);
//			}
//		
		}
		
	}

}
