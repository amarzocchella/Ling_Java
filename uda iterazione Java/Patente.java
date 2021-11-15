import java.io.*;
public class Patente {
  public static void main( String[] args ) throws Exception {
	// Variabili di input
	String risp;
	//Acquisisci risposta 
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	System.out.println("Sei maggiorenne? (s/n)");
	risp = input.readLine();
	//Comunica i dati di output
	if( !(risp.equals("S") || risp.equals("s")) )
	  System.out.println("Non puoi prendere la patente");
	else
	 System.out.println("Puoi prendere la patente");
  }
}
