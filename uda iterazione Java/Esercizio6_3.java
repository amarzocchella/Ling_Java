/**

- Esercizio 6.3 Scrivete un programma che prende in input un numero intero 'n' 
  e stampa i numeri da 1 a 'n' in ordine inverso. 
  (Ad esempio, con input 3 stampa '3 2 1'). 
**/
 

import jbook.util.Input;

public class Esercizio6_3 {

	public static void main(String[]args){
		int n=Input.readInt("Inserire un numero intero ");
		for(int i=n; i>=1; i--)
			System.out.println(i);
	}
	
}
