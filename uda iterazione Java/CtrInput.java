
import java.util.Scanner;
public class CtrInput{
  public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int tanti, prove = 0;
    do                // ciclo di controllo input
    {                 // compreso tra 1 e 10
      System.out.print("Inserisci 1 < N < 10: ");
      tanti = in.nextInt();
      prove= prove + 1;
    }while ((tanti < 1)||(tanti > 10));
    System.out.print("\nOK dopo " + prove + " !");
  }
}

