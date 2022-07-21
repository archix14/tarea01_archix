public class ejercicio16 {
    
    public void generador16() {
        
            System.out.println("Ingrese la Dimension de la Matriz:"); 
            int dimension=cs.nextInt();
            System.out.println("");
            String[][] matriz=new String[dimension][dimension];
            int valor=0;
             for (int fila = matriz.length-1; fila >= 0; fila--) {
                 if(fila%2==0){
                     for (int columna = 0; columna < matriz.length; columna++) {
                         matriz[fila][columna]=""+valor;
                         valor++;
                     }
                 }else{
                     for (int columna = matriz[0].length-1; columna >= 0; columna--) {
                         matriz[fila][columna]=""+valor;
                         valor++;
                    }
                }
            }
             imprimirMatrices(matriz);
    }
    public static void main(String[] args) {
        //ejercicio28//
    }
}




    