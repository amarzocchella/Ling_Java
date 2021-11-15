
import java.util.Scanner;
public class Indovina{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    final int MAX_TENTA= 7;  // max numero tentativi
    int num, conta = 0, prova;
    System.out.print("\nIndovina il numero - ");
    num = (int)(Math.random()* 100) + 1; //tra 1-100
    do{
      System.out.print("inserisci un numero : ");
      prova = in.nextInt();
      conta++;
      if(prova < num)
        System.out.print("... troppo piccolo - ");
      if (prova > num)
        System.out.print("... troppo grande  - ");
    }while((num != prova) && (conta != MAX_TENTA));
    if(num == prova){
      System.out.print("Bravo, hai indovinato ");
      System.out.print("in " + conta + " tentativi!");
    }else{
      System.out.print("Peccato, non hai indovinato");
      System.out.print("in " + conta + " tentativi");
      System.out.print("\nIl numero era " + num);
    }
  }
}



