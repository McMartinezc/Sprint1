package n1ex1;

public class App {

	public static void main(String[] args){
		
		Instrument[] llistaInstruments = new Instrument[3];
		llistaInstruments[0] = new Vent ("Saxofon",430);
		llistaInstruments[1] = new Corda ("Guitarra",200);
		llistaInstruments[2] = new Percussio ("Bateria", 500);
		
		for (Instrument instrument: llistaInstruments) {
			System.out.println(instrument.toString());
			System.out.println(instrument.tocar());
		}
	}

}
