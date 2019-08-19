package contructors_this;

public class Constructors_This {

	private int one ;
	
	public Constructors_This(int one) {
		
		this.one = one ;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Constructors_This ct = new Constructors_This(80);
		
		System.out.println(ct.one);

	}

}
