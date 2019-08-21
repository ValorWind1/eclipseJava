package abstract_class;

public abstract class GameObject {
	// prevent us to create an instance of the object because its abstract
	// Abstract, classes exist to be extended,they can not be instatiaded
	
	
	// benefit : we can use abstract methods 
	// abstract methods = 
	
	public abstract void draw(); // abstract methods we just need ; not {}
	
	
	
	
	public static void main(String[] args) {
		
		
		Player player = new Player();
		player.draw();
		
		
		Menu menu = new Menu();
		menu.draw();
		
		System.out.println();
		GameObject [] gameobj = new GameObject[2];
		gameobj[0] = player ; 
		gameobj[1] = menu ; 
		
		for(GameObject i : gameobj) {
			i.draw();
		}
		
		
	}
	

}
