import java.util.Scanner;
public class PitagoricaParziale{
  public static void main(String[] args){
    int conta, numero;
    Scanner in = new Scanner(System.in);
    System.out.print("Tabellina da visualizzare: ");
    numero = in.nextInt();
    for(conta = 1; conta <= 6; conta++){
      System.out.print(conta * numero + " \t");
    }
  }
}




