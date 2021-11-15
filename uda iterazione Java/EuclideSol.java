import java.util.Scanner;
public class EuclideSol{
  public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int num1, num2, tempo, resto;

    int scelta = 1;                       // definizione e inizializzazione
    System.out.println("\nAlgoritmo di Euclide per il calcolo del MCD.");
    while (scelta > 0)
    {
      System.out.println("\nInserisci due numeri : ");
      num1 = in.nextInt();
      num2 = in.nextInt();
	  // controlla se num1 o num2 sono = 0
	  if (num1 == 0)                 // scambiali tra loro
       num1 = 1;
      if (num2 == 0)                 // scambiali tra loro
       num2 = 1;
     
	  // controlla se num1> num2 ed eventualmente li scambia
      if (num2>num1)                 // scambiali tra loro
      { 
        tempo= num2;
        num2 = num1;
        num1 = tempo;                                 
      }
	  while(num2 > 0)             
      {
        resto = num1 % num2;  // calcolo del resto
        num1  = num2;         // scambio dei numeri
        num2  = resto;
      }
      System.out.println("\nil MCD e' " + num1);
         // chiede all'utente l'eventuale ripetizione completa del programma
      System.out.println("\n vuoi effettuare una nuova elaborazione S=1 N=0? ");
      scelta = in.nextInt();                    // legge un carattere 
    }    
  }
}

