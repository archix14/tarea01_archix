package pe.edu.upeu.jaqh.Examen;

 import java.util.Scanner;

/**
 * ejercicio03
 */
public class ejercicio3 {
  Scanner leer=new Scanner(System.in);
   public void ExamenMEFLL3() {
      int nut;
      System.out.print("ingrese la altura de la X:");
      nut = leer.nextInt();
      for (int i = 1; i <= nut; i++) {
          for (int j = 1; j <= nut; j++) {
              if (i == j || i + j == nut + 1)
                  System.out.print("*");
              else
                  System.out.print(" ");
          }
          System.out.println();

      }
  }
  public static void main(String[] args) {
    ejercicio3();   
  }
}

            
         



    
     

