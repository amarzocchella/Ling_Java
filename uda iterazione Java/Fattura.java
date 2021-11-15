import java.io.*;

public class Fattura {
	public static void main( String[] args ) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );

		//Variabili di input
		int numPezzi;
		float totFattura;
	
		//Variabili di output
		float sconto, importo;
	
		//Acquisisci numPezzi e totFattura
		System.out.println("Inserire il numero di pezzi in fattura: ");
		String line = input.readLine();
		numPezzi = Integer.parseInt( line );	
	
		System.out.println("Inserire il totale della fattura: ");
		line = input.readLine();
		totFattura = Float.parseFloat( line );	
	
		//Decidi lo sconto
		switch (numPezzi)
		{
			case 1:
				sconto = totFattura / 100 * 15;
				break;
			case 2:
				sconto = totFattura / 100 * 20;
				break;
			case 3:
				sconto = totFattura / 100 * 30;
				break;
			default:
				sconto = totFattura / 100 * 40;
				break;
		}
	
		//Calcola l'importo
		importo = totFattura - sconto;
	
		//Comunica importo e sconto
		System.out.println("L'importo da pagare e': " + importo);
		System.out.println("Lo sconto applicato e': " + sconto);
	}
}
