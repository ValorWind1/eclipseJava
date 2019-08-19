package lambda;

import java.util.Arrays;
import java.util.List;


public class Lambda_expressions {

	public static void main(String[] args) {
	
			List<Integer> nums = Arrays.asList(4,5,6,7,8);
			
			nums.forEach( i -> System.out.println(i)); // Lambda Expression

	}

}
