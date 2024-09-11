
public abstract class WalkBehindMower extends Mower{
	double cutWidth;
	double wheelDiameter;
	
	WalkBehindMower(){
		cutWidth = 0.0;
		wheelDiameter = 0.0;
	}
	
	WalkBehindMower(double cutWidth, double wheelDiameter){
		this.cutWidth = cutWidth;
		this.wheelDiameter = wheelDiameter;
	}
	
	public double getCutWidth() {
		return cutWidth;
	}
	
	public void setCutWidth(double cutWidth) {
		this.cutWidth = cutWidth;
	}
	
	public double getWheelDiameter() {
		return wheelDiameter;
	}
	
	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	
	public String toString() {
		return "Cut Width: " + cutWidth + "\nWHeel Diameter: " + wheelDiameter;
	}
	
}
