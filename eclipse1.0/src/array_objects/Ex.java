package array_objects;

import java.util.Scanner;


public class Ex {

	public static void main(String[] args) {
		
		// array of objects = array of reference variables 
		Car [] cr = new Car[3];
		
		Scanner sc = new Scanner (System.in);
		
		String temp ;
		
		
		
		for(int i = 0 ; i < cr.length;i++) {
			System.out.println("Enter the car model: ");
			
			temp = sc.nextLine();
	
			cr[i] = new Car();
			cr[i].setModel(temp);
			
			
		}
		for(int i = 0 ; i <cr.length;i++) {
			System.out.println("The model: "+ cr[i].getModel());
			
		}
		

	}

}
