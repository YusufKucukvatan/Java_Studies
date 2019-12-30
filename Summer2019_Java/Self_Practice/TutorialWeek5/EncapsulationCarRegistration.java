package TutorialWeek5;

public class EncapsulationCarRegistration {
	
	private final static String country="USA";
	private static String state="VA";
	private int VIN=12345;
	private String make="BMW";
	private String model="3.20";
	private int year=2015;
	private String owner="Muhtar Mahmut";
	public static String getState() {
		return state;
	}
	public static void setState(String state) {
		EncapsulationCarRegistration.state = state;
	}
	public int getVIN() {
		return VIN;
	}
	public void setVIN(int VIN) {
		this.VIN = VIN;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	

	

}
