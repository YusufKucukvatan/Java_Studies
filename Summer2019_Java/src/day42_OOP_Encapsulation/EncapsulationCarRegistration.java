package day42_OOP_Encapsulation;

public class EncapsulationCarRegistration {
	
	final static String country="USA";
	private static String state="VA";
	private int VIN=12345;
	private String make="BMW";
	private String model="3.20";
	private int year=2015;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private String owner="Muhtar Mahmut";
	
	public String getState() {
		return state;
	}
	public void setState(String newState) {
		if(newState.length()==2 && newState.startsWith("M"))
		state=newState;
	}
	public int getVIN() {
		return VIN;
	}
	public void setVIN(int VIN) {
		if(VIN>0 && VIN%2==0)
		this.VIN=VIN;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
}
