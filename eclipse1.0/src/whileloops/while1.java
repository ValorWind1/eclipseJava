package whileloops;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		
		String choice;
		
		
		boolean cont = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the command keyword to exit a loop in Java");
		
		
		
		System.out.println("A. int");
		System.out.println("B. continue");
		System.out.println("C. break");
		System.out.println("D. exit");
		
		System.out.println("Type the letter: ");
		
		choice = sc.nextLine();
		
		
		while(!cont) {
			if(choice.equals("a")|| choice.contentEquals("b")||choice.contentEquals("d")) {
				System.out.println("incorrect");
				break;
			}
			if(choice.equals("c")) {
				System.out.println("You are correct");
				break;
			}
			
		}
		
	}

}
