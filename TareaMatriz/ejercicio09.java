public class ejercicio09 {
    
    public void generador09() {
        Scanner CS=new Scanner(System.in);
        String[][] matriz;
        System.out.println("Ingrese dimesion de la Matriz:");
        int dimension = CS.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = CS.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= (matriz.length - 1) - f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
      public static void main(String[] args) {
        //ejercicio07//
        new ejercicio09().generador09();
      }    

 }
        
    

