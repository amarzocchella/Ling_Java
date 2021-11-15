import java.util.Scanner;
public class Equivalenti{
  public static void main(String[] args){
    int x, inizio, fine, passo;
    Scanner in = new Scanner(System.in); 
    System.out.print("Valore iniziale: ");
    inizio = in.nextInt(); 
    System.out.print("valore finale  : ");
    fine = in.nextInt(); 
    System.out.print("passo (step)   : ");
    passo = in.nextInt(); 
    // iterazione determinata FOR
    for(x = inizio; x <= fine; x = x + passo)              
      System.out.print("ciaoF \t");
    System.out.print(" \n");
    // iterazione indeterminata WHILE 
    x = inizio;
     while (x <= fine){
       x = x + passo;              
      System.out.print("ciaoW \t");
    };
  }
}
   

