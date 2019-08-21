package charat;

public class CharAt {

	public static void main(String[] args) {
		
		String s = "Hello World!";
		
		char c = s.charAt(0);
		
		System.out.println(c);
		
		System.out.println();
		
		for(int i =0 ; i <s.length();i++) {
			System.out.println(s.charAt(i));
		}

	}

}
