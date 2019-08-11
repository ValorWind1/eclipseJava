package Scanner;
import java.util.Scanner;


public class Scan3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a,b;
		
		System.out.println("Type your first string: ");
		a = sc.nextLine();
		System.out.println();
		
		System.out.println("Type your second line: ");
		b = sc.nextLine();
		System.out.println();
		
		if(a.equals(b)) {
			System.out.println("same");
		}else {
			System.out.println("not the same");
		}
		
	}

}
