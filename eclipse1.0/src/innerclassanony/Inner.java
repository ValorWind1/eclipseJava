package innerclassanony;

interface Inner {
	void food();
	
}

class Annonymous{
	


	public static void main(String[] args) {
		
		Inner a = new Inner () {
			public void food () {
				System.out.println("pancakes");
			}
			
		};
		
		a.food();
		
	}
	

}
