package n1ex2;

public class App {

	public static void main(String[] args) {
		Cotxe cotxe = new Cotxe (); //Instanciem i assignem objecte
		
		//Per poder cridar metodes o atributs statics
		System.out.println(Cotxe.frenar()); //Accedim amb el nom de la classe i cridem metode
		System.out.println(Cotxe.getMarca());//Accedim amb el nom de la classe i accedim al atribut que es static i final, és una constant de la classe Cotxe
		System.out.println(Cotxe.getModel());
		
		System.out.println(cotxe.getPotencia());//Per accedir a la potencia 
		System.out.println(cotxe.toString());
		System.out.println(cotxe.accelerar()); //Accedim desde la variable creada aquesta classe
	}

}
