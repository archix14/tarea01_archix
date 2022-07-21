import java.util.Scanner;

public class ejercicio20 {
  
  
    public void generador20() {
    Scanner cs=new Scanner(System.in);
     String[][] matriz;
      System.out.println("Ingrese la dimension de la Matriz:");
      int dimension=cs.nextInt();//5
      System.out.println("");
      int valor=0;
      matriz=new String[dimension][dimension];
      for (int columna = 0; columna < matriz[0].length; columna++) {
          if(columna%2==0){
               for (int fila = 0; fila < matriz.length; fila++) {
                   matriz[fila][columna]=String.valueOf(valor);
                   valor=valor+1;
               }
          }else{
             
              for (int fila = matriz.length-1; fila >= 0; fila--) {
                   matriz[fila][columna]=String.valueOf(valor);
                   valor=valor+1;
              }
          }
      }
      imprimirMatriz(matriz);
   } 
   public static void main(String[] args) {
      generador().generador20();
   }
}  
