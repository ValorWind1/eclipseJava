package lambda;

public interface LambdaDemo {
	
	void show(int i );
	
	
//	class A implements LambdaDemo {
//		
//	public void show() {
//		System.out.println("Hi");
//	}
//		
//	}
	

	public static void main(String[] args) {
		
		 
		
//		LambdaDemo obj = new LambdaDemo() {  // anonymous Inner class 
//			
//			
//			public void show() {
//				System.out.println("Hi");
//			}
//		}; // notice the semicolon 
		
		
		LambdaDemo obj;
		obj = i -> System.out.println("Hello : "+i);
			
		
		
		obj.show(7);

	}

}
