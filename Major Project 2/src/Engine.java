
public class Engine {
	String manufacturer;
	double hoursePower;
	int cylinder;
	
	Engine(){
		manufacturer = "";
		hoursePower = 0.0;
		cylinder = 0;
	}
	
	Engine(String manufacturer, double hoursePower, int cylinder){
		this.manufacturer = manufacturer;
		this.hoursePower = hoursePower;
		this.cylinder = cylinder;
	}
	
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setHoursePower(double hoursePower) {
		this.hoursePower = hoursePower;
	}
	
	public double getHoursePower() {
		return hoursePower;
	}
	
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	
	public int getCylinder() {
		return cylinder;
	}
	
	public String toString() {
		return "Manufacturer: " + manufacturer + "\nHourse Power: " + hoursePower + "\nCylinder: " + cylinder;
	}
	
}
