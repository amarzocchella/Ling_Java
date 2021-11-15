/**

- Esercizio 8.2 Scrivete un programma che prende in input un numero intero 'n' 
  e stampa un triangolo fatto di asterischi con base ed altezza 'n'. 
  Ad esempio, con input 4 stampa
  *
  **
  ***
  **** 

**/
 

import jbook.util.Input;

public class Esercizio8_2 {

	public static void main(String[]args){
		int n=Input.readInt("Inserire un numero intero ");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
