package list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListJava {
	
	
	public static void main(String[] args) {
		
		int [] ints = new int [] {1,2,3}; // array of integers
		
		List<Integer> intsList = new ArrayList<Integer>();
		
		List<Integer> intsList1 = new LinkedList<Integer>();
		
		intsList.add(5);
		intsList.add(2);
		intsList.add(510);
		
		intsList1.add(5);
		intsList1.add(2);
		intsList1.add(510);
		
		
		System.out.println(intsList);
		System.out.println(intsList1);
		
		//List is an interface
		//arraylist/linkedlist are concrete 
		
	}

}
