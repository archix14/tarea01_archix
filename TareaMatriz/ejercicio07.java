public class ejercicio07 {
    
   public void generador07() {
      
         System.out.println("Ingrese dimesion de Matriz:");
         int dimension = cs.nextInt();
         System.out.println("Ingrese valor inicial:");
         int valor = cs.nextInt();
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
      //rz/
     }
}
        
  

