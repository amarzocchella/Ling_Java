
 import java.util.Scanner;
 public class Fibonacci{
   public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     int num1, conta, fibA, fibB, fibC;
     fibA = 1;         // primo termine
     fibB = 1;         // secondo termine
     conta = 2 ;
     System.out.print("Quanti termini desideri? ");
     num1 = in.nextInt();
     System.out.print ("1, 1"); // primi 2 termini
     while(conta < num1){
       fibC = fibA + fibB;
       System.out.print(", " + fibC);
       conta++;         // aggiorno il contatore
       fibA = fibB;     // ultimo diventa penultimo
       fibB = fibC;     // il nuovo diventa ultimo
     }
   }
 }


