import java.util.Scanner;
public class PariDispariSol{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in); 
    int tanti, numero, conta, totPari, totDispari, contaPari, contaDispari;
    do{                        // compresa tra 10 e 20
      System.out.print("Inserisci un numero 10 < N < 20: ");
      tanti = in.nextInt();;
    }while ((tanti < 10)||(tanti > 20));
    conta = 0;
    contaPari  = 0;                   
    contaDispari  = 0;                   
    totPari  = 0;                   
    totDispari  = 0;                   
    do{
      numero = (int)(Math.random()* 100) + 101;  // numero tra 100 e 200
      conta = conta + 1;                // incremento il contatore
       if ( conta % 2 == 0 ){
        contaPari++;
        totPari+=numero;
      }else{
        contaDispari++;
        totDispari+=numero;
      }
    }while (conta < tanti);            // condizione di uscita  
    System.out.print( "\ni pari sono : " + contaPari);
    System.out.print( "\nla media e\'  : " + totPari/contaPari);
    System.out.print( "\ni dispari sono : " + contaDispari);
    System.out.print( "\nla media e\'    : " + totDispari/contaDispari);
 }
}
