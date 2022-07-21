public class ejercicio03 {
    public void transformador03 () {
        String[][]matriz;
        System.out.println("ingrese la dimencion de la matriz");
        int dimension=CS.neXtInt();
        matriz=new String[dimension][dimension];
        for (int columna = 0; columna < matriz[0].length; columna++) {
         if (columna%2==0) {
            for (int fila = 0; fila< matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            } else {
             for (int fila = matriz.length-1; fila>=0;fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
         }
        }
    }
        
    public static void main(String[] args) {
        traformador().transformador03();
    }
}
