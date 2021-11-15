/**
 * Esercizio 7.2 Scrivete un programma che chiede in input una sequenza
 * di numeri e si ferma quando l'utente immette 0.
 */

 
import jbook.util.Input;

public class Esercizio7_2 {

	public static void main(String[] args) {
		int n;
		do {
			n = Input.readInt("Inserisci un numero ");
		} while (n != 0);
		
		System.out.println("Ciclo terminato");
	}
}
