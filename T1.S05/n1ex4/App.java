package n1ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Introdueix la ruta del fitxer: ");
			String ruta = input.nextLine();
			
			FileReader llegirFitxer = new FileReader(ruta);
			BufferedReader br = new BufferedReader(llegirFitxer);
			String linea = br.readLine();
						
			while(linea !=null) {
				
				System.out.println(linea);
			}
			
			br.close();
			
		}catch(FileNotFoundException error) {
			error.getMessage();
		}catch(IOException error) {
			error.getMessage();
		}
	}
}

