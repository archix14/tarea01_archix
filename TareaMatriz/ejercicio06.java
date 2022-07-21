public class ejercicio06 {
 
    public void generador06() {
        
            String[][] matriz;
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            System.out.println("Ingrese valor inicial:");
            int valor = cs.nextInt();
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
            
        }
}
