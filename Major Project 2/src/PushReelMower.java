
public class PushReelMower extends WalkBehindMower{
	int numWheels;
	String type;
	
	PushReelMower(){
		numWheels = 0;
	}
	
	PushReelMower(int numWheels){
		this.numWheels = numWheels;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public int getWheels() {
		return numWheels;
	}
	
	public String toString() {
		return "Number of Wheels: " + numWheels;
	}
}
