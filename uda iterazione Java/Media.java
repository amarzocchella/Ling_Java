import java.io.*;
public class Media{
  public static void main( String[] args ) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	//Variabili di input
	int num;
	String risposta;
	//Variabili d'appoggio
	float somma;
	int contatore;
	//Variabili di output
	float media;
	//Inizializzo le variabili di appoggio
	somma = contatore = 0;
	//Ciclo di esecuzione
	do{
	  //Acquisisco i dati di input
	  System.out.println("Inserire un numero: ");
	  String line = input.readLine();
	  num = Integer.parseInt( line );
	  //Calcolo i parziali di somma e contatore
	  somma = somma + num;
	  contatore++;
	  //Verifico se ci sono altri numeri
	  System.out.println("Sono finiti i numeri? (s/n) ");
	  risposta = input.readLine();
	} while (risposta.equals("n"));
	//Calcolo la media
	media = somma / contatore;
	//Comunico i dati di output
	System.out.println("La media dei numeri inseriti e': " + media);
  }
}
