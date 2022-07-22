  
  /**
   * ejercicio20
   */
  public class ejercicio20 {
       private void generador20() {
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];   
        for (int c = matriz[0].length-1; c >=0 ; c--) {
            for (int f =0 ; f < matriz.length-((dimension-1)-c); f++) {               
                matriz[f][c]=String.valueOf(valor);
                valor++;
            }
        }        
        imprimirMatriz(matriz);
     } 
     public static void main(String[] args) {
        //ejercicio// 17
        new generador().generador20();
      }   
    }

