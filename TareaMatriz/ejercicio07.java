public class ejercicio07 {
    
   public void generador07() {
    public void generador07() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[f][c] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
     public static void main(String[] args) {
      //ejercicio12//
      new generador().generador07();
     }
}
        
  

