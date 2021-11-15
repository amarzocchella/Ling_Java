import java.io.*;
public class Somma {
  public static void main( String[] args ) {
	//Costruisce l'oggetto di accesso alla tastiera
	BufferedReader input = new BufferedReader(
		new InputStreamReader( System.in )
	);
	try {
	  //Acquisisce il primo numero
	  System.out.println("Digita il primo numero intero:");
   	  String line = input.readLine();
	  int numero1 = Integer.parseInt( line );
	  //Acquisisce il secondo numero
	  System.out.println("Digita il secondo numero intero:");
	  line = input.readLine();
	  int numero2 = Integer.parseInt( line );
	  //Stampa la somma dei due numeri
	  System.out.println("Somma = " + (numero1+numero2) );
	} catch( IOException ex ) {
	  System.err.println("Si e' verificato un errore");
	  ex.printStackTrace();
	}
  }
}
