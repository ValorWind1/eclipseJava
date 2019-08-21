package functional_interface;

public class Ex {
	public static void main(String[] args) {
		
		Dan anonymousClass = new Dan(){
			   
		      @Override
		      public void calculate(String fname,String lname) {
		          int n2=2;
		          System.out.println("result = " +(fname+lname));
		      }
		  };
		
		
	}
}
