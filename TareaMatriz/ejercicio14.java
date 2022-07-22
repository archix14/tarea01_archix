public class ejercicio14 {

    public void generador14() {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
     public static void main(String[] args) {
        //ejercicio26//
        new ejercicio14().generador14();
     }
 }

