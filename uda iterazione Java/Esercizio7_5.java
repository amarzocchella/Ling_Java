/**
 * Esercizio 7.5 Scrivete un programma che prende in input un numero 
 * intero 'n' e stampa la successione di Fibonacci fino a 'n'. 
 * (La successione di Fibonacci si ottiene partendo dai numeri 0 e 1, 
 * ed ogni termine successivo è la somma dei due che lo precedono. 
 * Esempio: 0, 1, 1, 2, 3, 5, 8).
 */

 

import jbook.util.Input;

public class Esercizio7_5 {

	public static void main(String[] args) {
		int n = Input.readInt("Inserisci un numero ");
		System.out.print("0");
		int precedente = 0;
		int corrente = 1;
		int somma = 1;
		
		while (somma <= n) {
			System.out.print(", "+somma);
			somma = precedente + corrente;
			precedente=corrente;
			corrente = somma;
		}		
	}
}
