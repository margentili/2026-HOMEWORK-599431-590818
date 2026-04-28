package it.uniroma3.diadia;
import java.util.Scanner;


public class IOConsole {

	
	/**
	 * Stampa a schermo il messaggio
	 * @param msg
	 * @return System.out.println del messaggio
	 */
	public void mostraMessaggio(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * Legge le righe, senza dover usare direttamente System.in
	 * @return la riga scansionata
	 */
	public String leggiRiga() {
		Scanner scannerDiLinee = new Scanner(System.in);
		String riga = scannerDiLinee.nextLine();
		//scannerDiLinee.close();
		return riga;
	}
}
