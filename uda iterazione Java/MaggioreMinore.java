import java.util.Scanner;
public class MaggioreMinore{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int min=0, max=0, numero, conta;
    for (conta = 1; conta < 7; conta++){
      System.out.print("inserisci un numero: ");
      numero = in.nextInt();
      if (conta==1){
        min = numero;
        max = numero;
      }
      else
        if (numero < min)
          min = numero;
        else
          if (numero > max)
            max = numero;
    }
    System.out.print("\nnumero minore  : " + min);
    System.out.print("\nnumero maggiore: " + max);
  }
}

