import java.util.Scanner;

public class ejercicio10 {
    
    public void generador10() {
        Scanner cs=new Scanner(System.in);
            System.out.println("Ingrese dimesion de matris:");
            int dimension = cs.nextInt();
            System.out.println("Ingrese valor inicial de la matris:");
            int valor = cs.nextInt();
            String[][] matriz = new String[dimension][dimension];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <= i; j++) {
                    matriz[i][i - j] = String.valueOf(valor);
                    valor++;
                }
            }
            imprimirMatriz(matriz);
        }
        public static void main(String[] args) {
            
        }
}

