public class ejercicio04 {
    
    public void generador04() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz[0].length; c++) {
            if (c % 2 == 0) {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
   public static void main(String[] args) {
       //ejercicio21//
       new generador().generador();
   }
}
   
