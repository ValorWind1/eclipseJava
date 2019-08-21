package defaultmethods;

public interface DefaultSpeed {

	default void cars(int n ) { 
		System.out.println("How many cars do I have in my garage ?: "+n);
	}
	
	abstract void amount(int n);
		
	
	
	
	
	public static void main(String[] args) {
	
		SecondClass sobj = new SecondClass();
		
		sobj.cars(5);
		sobj.amount(5);

	}

}
