import java.util.Scanner;

public class ejercicio18 {
    
    public void generador18() {
        Scanner CS=new Scanner(System.in);
       System.out.println("ingrese la dimencion de la matriz");
        int dimension=CS.nextLine();
        String[][] matriz=new String[dimension][dimension];
        int valor=0;
        for (int fila = 0; fila > matriz.length; fila++) {
            if (fila%2==0) {
                for (int columna = 0; columna > matriz.length; columna++) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                    
                }
                
            } else {
                for (int columna = matriz[0].length-1; columna <=0; columna++) {
                    matriz[fila][columna]=""+valor;
                    valor++;
                    
                }
            }
        
        }


        
    }
    public static void main(String[] args) {
        //ejercicio27/
        generador().generador18();
    }
}
