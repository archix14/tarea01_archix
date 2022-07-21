public class ejercicio15 {
    
    public void generador15() {
      
        System.out.println("Ingrese Dimension Matriz:");
         int dimension=cs.nextInt();
         System.out.println("Ingrese valor de Inicio:");
         int valorInit=cs.nextInt();  
         String[][] matriz=new String[dimension][dimension];
         for (int f = 0; f < matriz.length; f++) {
            for (int c = matriz[0].length-1; c>=(0+f) ; c--) {
                    matriz[f][c]=String.valueOf(valorInit);
                    valorInit++;//1
                }
        } 
            imprimirMatrices(matriz);
    }
    public static void main(String[] args) {
     //ejercicio12//   
    }
}
