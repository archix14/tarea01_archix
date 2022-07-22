public class ejercicio12 {
    
    public void generador12() {
        Scanner CS=new Scanner(System.in);
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][i - j] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio10//
        new ejercicio12().generador12();
    }
}

