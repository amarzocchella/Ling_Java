import java.io.*;
public class Prodotto {
	public static void main( String[] args ) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
		//Variabili di input
		int fattore1, fattore2;
		//Variabili di output
		int prodotto;
		//Variabili di lavoro
		int i;
		//Acquisisci fattore1, fattore2
		System.out.println("Inserire il primo fattore: ");
		String line = input.readLine();
		fattore1 = Integer.parseInt( line );		
		System.out.println("Inserire il secondo fattore: ");
		line = input.readLine();
		fattore2 = Integer.parseInt( line );		
		//Inizializza le variabili di output
		prodotto = 0;
		//Ciclo
		for (i = 1; i <= fattore2; i++)
		{
			prodotto = prodotto + fattore1;
		}
		//Comunica prodotto
		System.out.println("Il prodotto vale: " + prodotto);
	}
}
