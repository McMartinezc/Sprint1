package n1ex1;

public abstract class Instrument{
	
	//Declarem atributs
	protected String nom;
	protected float preu;
				
	//Metode constructor
	public Instrument(String nom, float preu){
		this.nom = nom;			
		this.preu = preu;
	}
	
	//Metode abstracte
	public abstract String tocar();
		
	//Metode toString
	public String toString(){
		return "Nom de l'instrument: "+nom 
			+"\nPreu de l'instrument: "+preu;
	}
}
