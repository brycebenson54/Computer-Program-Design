
public class GasPoweredMower extends WalkBehindMower{
	Engine engine;
	boolean selfPropelled;
	String type;
	
	GasPoweredMower(){
		engine = new Engine();
		selfPropelled = true;
	}
	
	GasPoweredMower(Engine engine, boolean selfPropelled){
		this.engine = engine;
		this.selfPropelled = selfPropelled;
	}
	
	public void setEngine(String manufacturer,double hoursePower,int cylinder){
		engine.setManufacturer(manufacturer);
		engine.setHoursePower(hoursePower);
		engine.setCylinder(cylinder);
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}
	
	public boolean getSelfPropelled() {
		return selfPropelled;
	}
	
	public String toString() {
		return engine.toString() + "\nSelf Propelled " + selfPropelled;
	}
}
