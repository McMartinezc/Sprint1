package n1ex2;

public class Cotxe {
	
	//Declarem atributs propis 
	private static final String MARCA= "Cotxe"; //És una constant de la classe, l'atribut és comú a tots els objectes de la classe
	private static String model; //Atribut que pertany a la classe
	private final int POTENCIA = 100; //Valor és final no és pot assignar un altre valor, no és pot sobreescriure
	
	//Metode constructor 
	public Cotxe () {
		model = "Model del cotxe"; // Al ser un atribut que pertany a la classe li assignem un valor
		
	}
	
	//Metodes GETTERS i SETTERS
	public static String getMarca() { //GetMarca per poder accedir a marca
		return MARCA;
	}
	public int getPotencia() {//GetPotencia per poder accedir a potencia
		return POTENCIA;
	}
	
	public static String getModel() {//GetModel per poder accedir a model
		return model;
	}
	
	//Metodes propis de la classe
	public static String frenar() {
		return "El vehicle està frenant";
	}
	
	public String accelerar() {
		return "El vehicle està accelerant";
	}
	
	//Metode toString
	public String toString(){
		return "Marca cotxe: "+MARCA 
				 +"\nModel cotxe: "+model 
				 +"\nPotencia cotxe: "+POTENCIA;
	}

} 
