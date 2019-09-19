package anonymous_inner_class;


interface Abc {
	void show();
	
}

public class anonymousInterfaceExample {
	public static void main(String[] args) {
		
		Abc obj = new Abc() {
			public void show() {
				System.out.println("anything");
			}
		};
		
		obj.show();
		
	}
	
}
