package n1ex1;

public class Percussio extends Instrument{

	public Percussio (String nom, float preu){
		super(nom, preu);
	
	}
	
	//Metode abstracte de la classe Instrument
	public String tocar(){
		return "Està sonant un instrument de percussió";
	}
	
	public String toString(){
		return super.toString();
	}
}
