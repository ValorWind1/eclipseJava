package arrayobjects;

public class Demo {
	public static void main(String[] args) {
		
		Rockstars [] rock = new Rockstars[3];
		
		//Instantiate each object
		for(int i = 0;i<rock.length;i++) {
			rock[i] = new Rockstars();
		}
		
		rock[0].setBand("Metallica");
		rock[0].setYear(1981);
		rock[0].setSales(125000000);
		
		rock[1].setBand("Led Zepellin");
		rock[1].setYear(1983);
		rock[1].setSales(125000000);
		
		
		for(int i =0;i<rock.length;i++) {
			System.out.println("Band: "+rock[i].getBand()+ "Year: "+rock[i].getYear()+"Sales: "+rock[i].getSales());
		}
		
		
	}

}
