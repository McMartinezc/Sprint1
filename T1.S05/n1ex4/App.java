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

	public static void main(String[] args) throws IOException {

		mostraContingut(introInfo("Introdueix ruta on vols buscar arxiu: "));
	}

	public static void mostraContingut(String nomArxiu) {

		try {
			String cadena;
			FileReader arxiu = new FileReader(nomArxiu);
			BufferedReader br = new BufferedReader(arxiu);
			while ((cadena = br.readLine()) != null) {
				System.out.println(cadena);
			}
			br.close();
		} catch (IOException error) {
			error.printStackTrace();
		}

	}

	// Metode sol.licita info a l'usuari
	static String introInfo(String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		return input.nextLine();// Retorna String
	}
}
