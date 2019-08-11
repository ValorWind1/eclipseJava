package Scanner;

import java.util.Scanner;
public class Scan2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer input1,input2;
		
		Integer total;
		
		
		System.out.println("Type your first number: ");
		input1 = sc.nextInt();
		
		System.out.println("Type your second number: ");
		input2 = sc.nextInt();
		
		total = input1 + input2;
		System.out.println("your total is: "+total);
		
		
	}
}
