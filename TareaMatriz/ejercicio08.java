public class ejercicio08 {
    
     public void generador08() {
        Scanner CS=new Scanner(System.in);
          System.out.println("Ingrese la dimesion de Matriz:");
          int dimension = CS.nextInt();
          System.out.println("Ingrese el valor inicial:");
          int valor = CS.nextInt();
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
       new ejercicio08().generador08();
      }
 }   
    

