/**

- Esercizio 6.2 Scrivete un programma che prende in input un numero intero 'n' 
  e stampa i numeri pari da 1 a 'n'. (Ad esempio, con input 7 stampa '2 4 6'). 

**/
 

import jbook.util.Input;

public class Esercizio6_2 {

	public static void main(String[]args){
		int n=Input.readInt("Inserire un numero intero ");
		for(int i=2; i<=n; i=i+2)
			System.out.println(i);
	}
	
}
