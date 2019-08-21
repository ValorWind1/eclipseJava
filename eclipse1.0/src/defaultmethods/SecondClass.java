package defaultmethods;

public class SecondClass implements DefaultSpeed  {

	@Override
	public void amount (int n) {
		if(n > 1) {
			System.out.println("Wow that's alot of Cars!");
		}
		
	}
	

}
