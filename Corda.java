package n1ex1;

public class Corda extends Instrument{
	
	public Corda (String nom, float preu){
		super(nom, preu);
	}
	
	//Metode abstracte de la classe Instrument
	public String tocar(){
		return "Està sonant un instrument de corda";
	}
	
	public String toString(){
		return super.toString();
	}
}
//static final tots el objectes de la classe tindran aquest atribut i no es podrà modificar
//metode final no es pot sobreescriure un metode 
//variable final un cop que te un valor aquell atribut no és pot modificar
//Un valor sigui static es que tots el objectes són iguals i si es canvia sera igual per tots els objectes de la classe