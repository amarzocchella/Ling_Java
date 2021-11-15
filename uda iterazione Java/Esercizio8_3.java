/**
  Esercizio 8.3 Scrivete un programma che prende in input una parola e 
  la stampa in diagonale. Ad esempio, se l'input è "mela" il programma 
  stampa
  |m| | | |
  | |e| | |
  | | |l| |
  | | | |a|
*/

 
import jbook.util.Input;

public class Esercizio8_3 {
	public static void main(String[] args) {
		String parola = Input.readString("Inserisci una parola: ");
		
		int l=parola.length();
		
		for(int riga=0; riga<l; riga++) {
			for(int col=0; col<l; col++)
				if (riga==col)
					 System.out.print("|"+parola.charAt(riga));
				else System.out.print("| ");
			System.out.println("|");
		}
	}	
}	