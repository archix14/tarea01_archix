public class ejercicio13 {
    
    public void generador13() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese el  valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio25//
        new generador().generador13();
    }
}
