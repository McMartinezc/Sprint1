package n1ex1;

public class Vent extends Instrument{
	
	//Metode constructor heredat de la classe Instrument
	public Vent (String nom, float preu){
		super(nom, preu);
	}
	
	//Metode abstracte de la classe Instrument
	public String tocar(){
		return "Està sonant un instrument de vent";
	}
	
}
