import java.io.*;
public class Spesa {
  public static void main( String[] args ) throws Exception {
	//Variabili di input
	float spesa;
	//Variabili di output
	float sconto;
	float importo;
	//Acquisisci spesa
	System.out.println("Inserire il valore della spesa: ");
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	String line = input.readLine();
	spesa = Float.parseFloat( line );
	// inizizlizza lo sconto
	sconto = 0;
	//Calcola lo sconto
	if (spesa > 100)
		sconto = spesa / 100 * 10;
	//Calcola l'importo
	importo = spesa - sconto;
	//Comunica importo
	System.out.println("L'importo da pagare e': " + importo);
  }
}
