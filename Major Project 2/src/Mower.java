
public abstract class Mower {
	String manufacturer;
	int year;
	String serialNumber;
	
	public Mower(){
		manufacturer = "";
		year = 0;
		serialNumber = "";
	}
	
	public Mower(String manufacturer, int year, String serialNumber){
		this.manufacturer = manufacturer;
		this.year = year;
		this.serialNumber = serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nYear: " + year + "\nSerial Number: " + serialNumber;
	}
	
	

}
