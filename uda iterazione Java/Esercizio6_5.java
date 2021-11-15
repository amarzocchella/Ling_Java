/* Esercizio 6.5 Scrivete un programma che prende in input una stringa 
 * e la stampa al contrario. Ad esempio, con input 'Ciao a tutti' stampa 'ittut a oaiC'.
 */

 

import jbook.util.Input;

public class Esercizio6_5 {

	public static void main(String[]args){
		String s=Input.readString("Inserire una stringa ");
		for(int i=s.length()-1; i>=0; i--)
				System.out.print(s.charAt(i));
	}
}