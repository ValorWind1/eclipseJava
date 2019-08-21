package stringmutable;




public class StringMutable {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer("Dan");
		
		sbf.append(" Leyghton");
		sbf.replace(0,4,"bruh ");
		sbf.insert(2, "hey");
		
		System.out.println(sbf);
		
		

	}

}
