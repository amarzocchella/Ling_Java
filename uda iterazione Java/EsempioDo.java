import java.io.*;
public class EsempioDo {
 public static void main( String[] args ) throws Exception {
	BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
	String line;
	do {
	System.out.println("Premere il tasto 'u' per uscire dal ciclo");
	line = input.readLine();
	} while( line == null || !line.equals("u") );
  }
}
