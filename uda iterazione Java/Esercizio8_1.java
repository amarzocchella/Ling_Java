/**
 Esercizio 8.1 Scrivete un programma che prende in input due numeri interi 'm' e 'n' 
 e stampa un rettangolo fatto di asterischi con base 'm' ed altezza 'n'. 
 Ad esempio, con input 6 e 4 stampa:
  ******
  ******
  ******
  ******
**/

 

import jbook.util.Input;

public class Esercizio8_1 {
	public static void main(String[]args){
		int m=Input.readInt("Inserire un numero intero (base): ");
		int n=Input.readInt("Inserire un numero intero (altezza): ");

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

