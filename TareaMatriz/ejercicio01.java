import javax.swing.text.html.CSS;

public class ejercicio01 {
    
 public void generador01() {
    String [][] matriz;
    System.out.println("ingrese la dimencion de la matriz");
    int dimension=CS.neXtInt();
    matriz=new String[dimension][dimension];
    for (int columna = 0; columna < matriz[0].length; columna++) {
      if(columna%2==0);
         for (int fila = 0; fila < matriz.length; fila++) {
          matriz[fila][columna]=String.valueOf(valor);
          valor=valor+1; 
        }
      

      for (int fila =matriz.length-1; fila >= 0; i++) {
         matriz[fila][columna]=String.valueOf(valor);
         
      }
    }
 }
     public static void main(String[] args) {
      
     }
}
