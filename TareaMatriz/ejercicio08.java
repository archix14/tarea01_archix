public class ejercicio08 {
    
     public void generador08() {
          System.out.println("Ingrese dimesion de la Matriz:");
          int dimension = lt.nextInt();
          System.out.println("Ingrese el valor inicial:");
          int valor = lt.nextInt();
          String[][] matriz = new String[dimension][dimension];
          for (int f = 0; f < matriz.length; f++) {
              for (int c = 0; c <= f; c++) {
                  matriz[f][c] = String.valueOf(valor);
                  valor++;
              }
          }
          imprimirMatriz(matriz);
      }
      public static void main(String[] args) {
       //ejercicio06//
       new generador().generador08();
      }
 }   
    

