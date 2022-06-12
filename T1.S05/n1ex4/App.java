package n1ex4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		llegirFitxer accedir = new llegirFitxer();
		accedir.llegir();
		escriureFitxer llegir =new escriureFitxer();
		llegir.escriure();
		
	/*	try {
			Scanner input = new Scanner(System.in);
			System.out.println("Introdueix el nom del fitxer: ");
			String nomFitxer = input.nextLine();
			String sortida = "C:\\Users\\psyen\\Desktop\\T1.S03\\";
			FileInputStream fitxer = new FileInputStream(sortida + nomFitxer + ".txt");
			InputStreamReader osw = new InputStreamReader(fitxer);
			BufferedReader br = new BufferedReader(osw);
			
			while(br.ready()) {
				String linea = br.readLine();
				System.out.println(linea);
			}

		}catch(FileNotFoundException error) {
			error.getMessage();
		}catch(IOException error) {
			error.getMessage();
		}
	}*/
	}
}
	class llegirFitxer{
		
		public void llegir() {
			try {
				FileReader entrada = new FileReader ("C:\\Users\\psyen\\Desktop\\T1.S03\\countries.txt"); //guardem a la variable entrada on es troba l'arxiu
				//FileReader entrada = new FileReader ("C:\\Users\\psyen\\Desktop\\T1.S03\\countries.txt", true); //escriu al fitxer existent
				BufferedReader mibuffer =new BufferedReader(entrada);
				String linia = "";
				
				while (linia !=null ) { 
					linia =mibuffer.readLine();
					
					if(linia !=null) {
					System.out.println(linia);
					}
				}
				
			} catch (FileNotFoundException e) {
				System.out.println ("No s'ha trobat l'arxiu.");
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	
	//Per casos de que hi ha poc text
	class escriureFitxer{
		
		public void escriure() {
			String frase ="Exemple";
			
			try {
				FileWriter escritura = new FileWriter ("C:\\Users\\psyen\\Desktop\\T1.S03\\noufitxer.txt");
				
				for(int i= 0; i<frase.length();i ++) {
					escritura.write((frase).charAt(i));
				}
				escritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

