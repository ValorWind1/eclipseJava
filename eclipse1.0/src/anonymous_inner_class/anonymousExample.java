package anonymous_inner_class;

class A{
	
	public void show() {
		System.out.println("in A show ");
	}
	
	
	
}

//class B extends A {
//	
//	public void show() {
//		System.out.println("Im the best ");
//	}
//}
// we dont need no overwrrite a methods like this in order to print im the best 

public class anonymousExample {
public static void main(String[] args) {
	
	A obj = new A() {
		public void show() {
			System.out.println("Im the best ");		}
	
	};
	
	obj.show();
}
}
