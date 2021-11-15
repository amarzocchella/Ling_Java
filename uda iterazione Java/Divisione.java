import java.io.*;
public class Divisione {
  public static void main( String[] args ) throws Exception {
	//Variabili di input
	int dividendo, divisore;
	//Variabili di output
	int quoziente, resto;
	//Acquisisci dividendo, divisore 
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	System.out.println("Inserire il dividendo: ");
	String line = input.readLine();
	dividendo = Integer.parseInt( line );	
	System.out.println("Inserire il divisore: ");
	line = input.readLine();
	divisore = Integer.parseInt( line );	
	//Inizializza quoziente
	quoziente = 0;
	//Eseguo il calcolo
	while (dividendo >= divisore) {
      dividendo = dividendo - divisore;
 	  quoziente++;
	}
	// il resto e' cio' che resta del dividendo	
	resto = dividendo;
	//Comunica quoziente e resto
	System.out.println("Il quoziente e': " + quoziente);
	System.out.println("Il resto e': " + resto);
  }
}
