public class ejercicio15 {
    
    public void generador15() {
        Scanner cs=new Scanner(System.in);
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = lt.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = (matriz.length - 1); f >= 0; f--) {
            if (f % 2 == 0) {
                for (int c = (matriz.length - 1); c >= 0; c--) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = "" + valor;
                    valor++;
                }
            }
        }
        imprimirMatriz(matriz);
    }
    
    public static void main(String[] args) {
     //ejercicio27//  
     new generador().generador15(); 
    }
}
