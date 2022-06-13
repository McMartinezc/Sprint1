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

		try {
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
	}
}
}

	

