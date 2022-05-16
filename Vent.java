package n1ex1;

public class Vent extends Instrument{
	
	public Vent (String nom, float preu){
		super(nom, preu);
	
	}
	
	//Metode abstracte de la classe Instrument
	public String tocar(){
		return "Està sonant un instrument de vent";
	}
	
	public String toString(){
		return super.toString();
	}
}
