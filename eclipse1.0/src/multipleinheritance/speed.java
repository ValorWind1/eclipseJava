package multipleinheritance;

public interface speed {
	
	default void phrase (String word ) { 
		System.out.println(" : "+word);
	}

}
