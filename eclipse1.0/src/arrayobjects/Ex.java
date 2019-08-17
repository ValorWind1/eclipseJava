package arrayobjects;

import java.util.Scanner;


public class Ex {

	public static void main(String[] args) {
		
		// You declare an array of reference variables 
		// that we declare a normal array
		
		Moons []  mObj = new Moons[3];
		
		// we assign variables the same we do to an array
		Scanner sc = new Scanner(System.in);
		
		String temp;
		
		// iterate through all the reference variable through the array
		
		for(int i = 0 ; i < mObj.length;i++) {
			
			System.out.println("Enter moons :  ");
			temp = sc.next();
			mObj[i] = new Moons ();
			mObj[i].setMoons(temp);
			
		}
		for(int i = 0; i <mObj.length;i++) {
			System.out.println("Satellites : "+mObj[i].getMoons());
			
		}
		
	}

}
