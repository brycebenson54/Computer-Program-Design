
public class CommercialMower extends LawnTractor{
	double operatingHours;
	boolean zeroTurnRadius;
	String type;
	
	CommercialMower(){
		operatingHours = 0;
		zeroTurnRadius = true;
	}
	
	CommercialMower(double operatingHours, boolean zeroTurnRadius){
		this.operatingHours = operatingHours;
		this.zeroTurnRadius = zeroTurnRadius;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setOperatingHours(double operatingHours) {
		this.operatingHours = operatingHours;
	}
	
	public double getOperatingHours() {
		return operatingHours;
	}
	
	public void setZeroTurnRadius(boolean zeroTurnRadius) {
		this.zeroTurnRadius = zeroTurnRadius;
	}
	
	public boolean getZeroTurnRadius() {
		return zeroTurnRadius;
	}
	
	public String toString() {
		return "Operating Hours: " + operatingHours + "\nZero Turn Radius: " + zeroTurnRadius;
	}
}
