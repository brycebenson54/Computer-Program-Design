
public class LawnTractor extends Mower{
	Engine engine = new Engine();
	String model;
	double deckWidth;
	String type;
	
	LawnTractor(){
		engine = new Engine();
		model = "";
		deckWidth = 0;		
	}
	
	LawnTractor(Engine engine, String model, double deckWidth){
		this.engine = engine;
		this.model = model;
		this.deckWidth = deckWidth;
	}
	
	public Engine getEngine() {
		return engine;
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
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public double getDeckWidth() {
		return deckWidth;
	}
	
	public void setDeckWidth(double deckWidth){
		this.deckWidth = deckWidth;
	}
	
	public String toString() {
		return "Engine: " + engine.toString() + "\nModel: " + model + "Deck Width: " + deckWidth;
	}
}
