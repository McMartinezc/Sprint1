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
			String nomFitxer = input.nextLine();
			
			File nouFitxer = new File (nomFitxer);
			FileReader llegirFitxer = new FileReader(nouFitxer);
			BufferedReader br = new BufferedReader(llegirFitxer);
		
						
			while(br.readLine() !=null) {
				
				System.out.println(br.readLine());
			}
			
			br.close();
			
		}catch(FileNotFoundException error) {
			error.getMessage();
		}catch(IOException error) {
			error.getMessage();
		}
	}
}

