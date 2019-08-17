package constructor;

public class Constructor {

	public static void main(String[] args) {
		
		//Notice how I'm already writing kelsey
		//As soon as I created the Object
		Side sideObj = new Side("Kelsey");
		// We can call 2 objects with one constructor
		Side sideObj1 = new Side("Maria");
		
		
		sideObj.talk();
		System.out.println();
		sideObj1.talk();

	}

}
