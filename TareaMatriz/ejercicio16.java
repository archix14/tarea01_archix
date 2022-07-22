public class ejercicio16 {
    
    public void generador16() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio30//
        new generador().generador();
    }
}




    