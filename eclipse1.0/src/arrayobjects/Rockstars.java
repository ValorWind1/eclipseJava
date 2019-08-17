package arrayobjects;


public class Rockstars{
	
	private String band;
	private int  year;
	private int sales;
	
	// constructor
	public Rockstars(String band, int year,int sales) {
		this.band = band;
		this.year = year;
		this.sales = sales;
	}
	
	
	
	public Rockstars() {
		this("Nirvana",1987,75000000);
	}
	
	

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}
	
	
	
	
	
}
