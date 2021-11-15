import java.util.Scanner;
public class FattorialeSol{
  public static void main(String[] args){
    long numero, conta, fatt = 0; 
    final int TAPPO = 0;
    Scanner in = new Scanner(System.in); 
    do{                            // ciclo esterno terminante con immissione di 0
      fatt = 1;                    // inizializza il fattoriale           
      do{ 
       System.out.print("\nInserisci il numero (0 per terminare): ");
       numero = in.nextInt(); 
       if (numero < 0)
        System.out.print("\nattenzione: il numero deve essere positivo!"); 
       if (numero > 14)
        System.out.print("\nattenzione: il numero deve inferiore a 14!"); 
      }while((numero < 0)||(numero > 14));
      if (numero > 0)
        for (conta = numero; conta > 1; conta--){              
          fatt = fatt*conta;                                    // calcolo del fattoriale
        }
      System.out.println ("il fattoriale di "+numero +" e' "+ fatt); // stampa il fattoriale
    }while(numero != TAPPO);
  }
}

   

