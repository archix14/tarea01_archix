public class ejercicio17 {
    
  public void generador17() {
    System.out.println("Ingrese la Dimension de la Matriz:"); 
    int dimension=cs.nextInt();
    System.out.println("");
    String[][] matriz=new String[dimension][dimension];//5
    int valor=0;              
    for (int v = 0; v < dimension/2; v++) {//2.5
        for (int ls = v; ls < (matriz[0].length-1)-v; ls++) {
            matriz[v][ls]=""+valor;
            valor++;
        }
        for (int ld = v; ld < (matriz.length-1)-v; ld++) {
            matriz[ld][(matriz.length-1)-v]=""+valor;
            valor++;
        }
        for (int lin = (matriz.length-1)-v; lin > v; lin--) {
            matriz[(matriz.length-1)-v][lin]=""+valor;
            valor++;
        }
        for (int liz = (matriz.length-1)-v; liz  > v; liz--) {
            matriz[liz][v]=""+valor;
            valor++;                
        }
    }
    if (dimension%2!=0) {
        matriz[dimension/2][dimension/2]=""+valor;
        }
    imprimirMatrices(matriz);
  }
   public static void main(String[] args) {
    //ejercicio29//
   }
}

