/**
 * Esercizio 7.4 Scrivete un programma che chiede in input il capitale 
 * (in euro) ed il tasso di interesse annuo (percentuale), e calcola 
 * dopo quanti anni il capitale raddoppia. 
 */

 
import jbook.util.Input;

public class Esercizio7_4 {

	public static void main(String[] args) {
		double c = Input.readDouble("Inserisci il capitale: ");
		double i= Input.readDouble("Inserisci l'interesse: ");
		double capitaleFinale = 2*c;
		int anni = 0;
		while(c < capitaleFinale) {
			c=c*(100+i)/100;
			anni++;
		}
		System.out.println("anni: "+anni);        
	}
}
