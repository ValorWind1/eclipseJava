package forloops;

public class for03 {

	public static void main(String[] args) {

		for(int i = 1; i < 7 ; i++) {
			
			for(int k = 7 - i ; k >= 1; k --)
				System.out.print("*");
			
			for(int j =1 ; j < i;j++)
				System.out.print(j);
			

			System.out.println("");
		}

	}

}
