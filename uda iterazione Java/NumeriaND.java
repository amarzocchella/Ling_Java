import java.io.*;

public class Numeri {
	public static void main( String[] args ) throws Exception {
		//Variabili di input
		int numero1, numero2;
		
		//Acquisisci numero1, numero2
		BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );

		System.out.println("Inserire il primo numero: ");
		String line = input.readLine();
		numero1 = Integer.parseInt( line );

		System.out.println("Inserire il secondo numero: ");
		line = input.readLine();
		numero2 = Integer.parseInt( line );
	
		//Controlla i numeri e comunica messaggio
		if ((numero1 == 100) && (numero2 == 100))
			System.out.println("I numeri sono entrambi 100");
		else
			System.out.println("Almeno un numero e' diverso da 100");
	}
}
