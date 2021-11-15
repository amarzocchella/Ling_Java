import java.io.*;
public class Indovina1 {
  public static void main( String[] args ) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	//Costanti
	final int Costante = 15;
	//Variabili di input
	int num;
	//Ciclo
	while( true )
	{
	  //Acquisisci num
	  System.out.println("Inserire un numero: ");
	  String line = input.readLine();
	  num = Integer.parseInt( line );
	  //Se num != costante
	  if (num != Costante)
  	  {
		continue;				//torna a while
	  } 
	  break; 					//interrompi ciclo
	}
	System.out.println("numero trovato!");
  }
}
