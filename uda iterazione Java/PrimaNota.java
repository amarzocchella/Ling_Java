
import java.util.Scanner;
public class PrimaNota{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
	int entrate=0, uscite=0, importo, saldo;
    do{
      System.out.print("Inserisci un importo: ");
      importo = in.nextInt();
      if (importo < 0)
		uscite = uscite + importo;
	  else
	    entrate = entrate + importo;
    }while(importo != 0);
    saldo = entrate + uscite;
    System.out.print(" Entrate= " + entrate);
    System.out.print("\t Uscite = " + uscite);
    System.out.print("\t Saldo  = " + saldo);
  }
}


