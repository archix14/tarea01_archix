public class ejercicio06 {
 
    public void generador06() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = (matriz.length - 1) - f; c >= 0; c--) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
        public static void main(String[] args) {
            //ejercicio11//
            new generador().generador06;
        }
}
