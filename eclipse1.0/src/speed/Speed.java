package speed;

public class Speed {
	
	public static void main(String[] args) {

		
		int [] evenodods = {5,7,2,4,9};
		
		int evens =0, odds =0;
		
		for ( int i = 0 ; i < evenodods.length;i++) {
			if (evenodods[i] % 2 ==0 ) {
				evens++;
			}else
				odds++;
		}
		System.out.println("evens : "+evens);
		System.out.println("odds: "+odds);
		
		}
	

 }               