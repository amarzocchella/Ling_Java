/**
 * Programma che verifica se un numero e' pari o dispari
 */


import java.util.Scanner;
public class PariDispari{
  public static void main(String[] args){
	Scanner in = new Scanner(System.in);
    System.out.print("Inserisci un numero: ");
	int num1 = in.nextInt();
	while(num1 > 1){    // condiz. di entrata
      num1 = num1 - 2;  // corpo del ciclo
    }

    if(num1 == 0)       // test sul risultato
      System.out.println("\n numero pari");
    else
      System.out.println("\n numero dispari");
  }
}



