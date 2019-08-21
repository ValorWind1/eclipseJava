package speed8;

import java.util.Arrays;
import java.util.List;


@FunctionalInterface
interface myinstance{
	void interfaceMethod();
}

public class sooed8 {
	
	public void classMethod() {
		System.out.println("class method: ");
	}
	
	public static void main(String[] args) {
		
	
	List <String> myArray = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
	
	
	long start = System.currentTimeMillis();
		myArray.stream().forEach(x -> System.out.print(x));
		
		
		
		sooed8 obj = new sooed8();
		
		myinstance mint = obj::classMethod;
		mint.interfaceMethod();
		

	}

}
