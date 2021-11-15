/*
 * Esercizio 7.3 
 * Scrivete un programma che chiede in input una sequenza di numeri 
 * e stampa le somme parziali. Il programma termina quando l'utente
 * immette 0. 
 * Ad esempio, se l'utente immette 2 5 3 0 allora il programma stampa 2 7 10.
 */

 
import jbook.util.Input;

public class Esercizio7_3 {

	public static void main(String[] args) {
		int n;
		int sommaParziale = 0;
		do {
			n = Input.readInt("Inserisci un numero ");
			sommaParziale = sommaParziale + n;
			System.out.println(sommaParziale);
		} while (n != 0);	
		
		System.out.println("Ciclo terminato");
	}
}
