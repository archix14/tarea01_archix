public class ejercicio05 {
 
    public void generador05() {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = (matriz[0].length - 1); c >= 0; c--) {
            if (c % 2 == 0) {
                for (int f = matriz.length - 1; f >= 0; f--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int f = 0; f < matriz.length; f++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
     public static void main(String[] args) {
        //ejercicio24//
        new ejercicio05().generador05();
     }
 }