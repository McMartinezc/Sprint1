package n1ex1;

public class Corda extends Instrument{
	//Bloc d'inicialització static, s'inicialitza en carregar la classe
	static{
		System.out.println("Inicialitzant corda");
	}
	
	//Metode constructor heredat de la classe Instrument
	public Corda (String nom, float preu){
		super(nom, preu);
	}
	
	//Metode abstracte de la classe Instrument
	public String tocar(){
		return "Està sonant un instrument de corda";
	}
	
}
