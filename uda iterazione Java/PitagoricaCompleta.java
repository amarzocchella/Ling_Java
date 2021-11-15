import java.util.Scanner;
public class PitagoricaCompleta{
  public static void main(String[] args){
    int num, fuori, dentro;
    Scanner in = new Scanner(System.in);
    System.out.print("Tabellina desiderata: ");
    num = in.nextInt();
    for(fuori = 1; fuori <= num; fuori++){
      System.out.print("\n");
      for(dentro = 1; dentro <= num; dentro++)
        System.out.print("\t" + fuori * dentro);
    }
    System.out.print("\n");
  }
}


