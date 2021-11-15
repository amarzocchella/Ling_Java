import java.io.*;
public class Spesa1 {
  public static void main( String[] args ) throws Exception {
	//Variabili di input
	float spesa;
	//Variabili di output
	float sconto;
	float importo;
	//Acquisisci le variabili di input
	System.out.println("Inserire il valore della spesa: ");
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	String line = input.readLine();
	spesa = Float.parseFloat( line );
	//Calcolo lo sconto
	if (spesa < 100)
		sconto = spesa / 100 * 5;
	else
		sconto = spesa / 100 * 10;
	//Calcolo l'importo
	importo = spesa - sconto;
	//Comunica i dati di output
	System.out.println("L'importo da pagare e': " + importo);
  }
}
