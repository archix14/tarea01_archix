public class ejercicio03 {
    public void generador03 () {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = (matriz[0].length - 1); f >= 0; f--) {
            for (int c = matriz[f].length-1; c >= f; c--) {
                matriz[c][f] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio20//
        new ejercicio03().generador03();
    }
}
