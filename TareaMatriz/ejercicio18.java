public class ejercicio18 {
    
    public void generador18() {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = 0; v < dimension / 2; v++) {
            for (int liz = dimension - 1 - v; liz > v; liz--) {
                matriz[liz][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls < dimension - 1 - v; ls++) {
                matriz[v][ls] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension - 1 - v; ld++) {
                matriz[ld][dimension - 1 - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension - 1 - v; lin > v; lin--) {
                matriz[dimension - 1 - v][lin] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio32/
        ejercicio18().generador18();
    }
}
