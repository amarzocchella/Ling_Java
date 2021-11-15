import java.io.*;
public class Triangolo {
   public static void main( String[] args ) throws Exception {
     //Variabili di input
     int lato;
     //Variabili di output
     int perimetro;
     double area;
     //Acquisisci Lato i dati di input
     System.out.println("Inserire la misura del lato del triangolo: ");
     BufferedReader input = new BufferedReader(new InputStreamReader( System.in ) );
     String line = input.readLine();
     lato = Integer.parseInt( line );
     //Calcola il perimetro
     perimetro = lato * 3;
     //Calcola l'area
     area = lato * lato * Math.sqrt(3) / 4;
     //Comunica Perimetro e Area
     System.out.println("Il perimetro del triangolo e': " + perimetro);
     System.out.println("L'area del triangolo e': " + area);
  }
}
