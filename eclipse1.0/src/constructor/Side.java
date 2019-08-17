package constructor;

public class Side {
	private String girlName;
	
	// Constructor Object
	public Side(String name) {
		girlName = name;
	}
	
	
	// Instead of going through all of this 
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	public void talk() {
		System.out.printf("ur first gf is %s\n",getName());
		
	}
}
