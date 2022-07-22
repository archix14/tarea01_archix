public class ejercicio19 {
    
    public void generador19() {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el svalor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int v = matriz.length - 1; v >= matriz.length / 2; v--) {
            for (int liz = (dimension - 1) - v; liz < v; liz++) {
                matriz[liz][(dimension - 1) - v] = String.valueOf(valor);
                valor++;
            }
            for (int lin = (dimension - 1) - v; lin < v; lin++) {
                matriz[v][lin] = String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld > (dimension - 1) - v; ld--) {
                matriz[ld][v] = String.valueOf(valor);
                valor++;
            }
            for (int ls = v; ls > (dimension - 1) - v; ls--) {
                matriz[(dimension - 1) - v][ls] = String.valueOf(valor);
                valor++;
            }
        }
        if (dimension % 2 != 0) {
            matriz[dimension / 2][dimension / 2] = String.valueOf(valor);
        }
        imprimirMatriz(matriz);
    }   
    public static void main(String[] args) {
        //ejercicio34//
        new generador().generador19();
    }
}

