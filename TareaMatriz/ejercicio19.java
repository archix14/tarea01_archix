public class ejercicio19 {
    
    public void generador19() {
        
            System.out.println("Ingrese Dimension Matriz:");
            int dimension=cs.nextInt();
            System.out.println("Ingrese valor de Inicio:");
            int valorInit=cs.nextInt();  
            String[][] matriz=new String[dimension][dimension];
            
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = matriz[0].length-1-fila; columna>= 0; columna--) {
                    matriz[fila][columna]=""+valorInit;
                    valorInit++;
                }
        }
      imprimirMatrices(matriz);
    }
    public static void main(String[] args) {
        //ejercicio11//
    }
}

