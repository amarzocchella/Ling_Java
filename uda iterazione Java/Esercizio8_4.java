/**

- Esercizio 8.4 Scrivete un programma che prende in input un numero intero 'n' 
  e stampa una piramide fatta di asterischi con altezza 'n'. 
  Ad esempio, con input 3 stampa
    *
   ***
  ***** 

**/
 

import jbook.util.Input;

public class Esercizio8_4 {

	public static void main(String[]args){
		int n=Input.readInt("Inserire un numero intero ");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++)
				if ( (j<=n-i) || (j>=n+i) )
					System.out.print(' ');	
				else
					System.out.print('*');
			System.out.println();
		}
	}
}
