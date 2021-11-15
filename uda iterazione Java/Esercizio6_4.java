/**
- Esercizio 6.4 Scrivete un programma che prende in input una stringa 
  e la stampa sostituendo tutti i caratteri non spazio con asterischi. 
  Ad esempio, con input 'Ciao a tutti' stampa '**** * *****'. 

**/
 

import jbook.util.Input;

public class Esercizio6_4 {

	public static void main(String[]args){
		String s=Input.readString("Inserire una stringa ");
		for(int i=0; i<=s.length()-1; i++)
			if (s.charAt(i)==' ')
				System.out.print(' ');
			else System.out.print('*');
	}
}
