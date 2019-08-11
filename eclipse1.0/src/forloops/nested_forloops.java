package forloops;

public class nested_forloops {
	// nested loops = for loop inside another for loop
	public static void main(String[] args) {
		
		for(int i =0;i < 5 ; i++) {
			System.out.println("eazy ");
			
		}
		System.out.println("----------------");
		
		String [] colors = {"Red","Blue","Green"};
		
		for (int i = 0 ; i < 3; i++) {
			System.out.println(colors[i]);
		}
		System.out.println("-----------------");
		
		// getting elements from 2 d array using nested loops 
		
		String [][] fancyColors = {{"Red","Blue","Green"},{"White","Black","Grey"}};
		
		for (int i = 0 ; i < 2 ; i++)  {    // DOES THE ROWS
			for ( int j = 0 ; j < 3 ;j++) {  // DOES THE COLUMNS 
				
				System.out.println(fancyColors[i][j]);
			}
		}
		System.out.println("------------------------");
		
		for(int i = 0 ; i < 5; i++ ) {  // we want to repeat 5 times,another for loop 5 times
			
			for(int j = 0 ; j < 10; j++) {
				
				System.out.println("i: "+ i +", j: "+j);
			}
		}
		
		
	
		
		
	}
	
}
			
		
		
