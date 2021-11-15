/**
- Scrivete un programma che prende in input un numero intero 'n' 
  e stampa 'n' asterischi. Ad esempio, con input 5 stampa *****. 
**/

import java.util.Scanner;
public class Esercizio6_1 {
  public static void main(String[]args){
     Scanner in = new Scanner(System.in); 
	int n=Input.readInt("Inserire un numero intero ");
	for(int i=1; i<=n; i++)
		System.out.print('*');
	}
	
}
