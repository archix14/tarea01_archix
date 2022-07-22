import java.util.Scanner;

public class ejercicio10 {
    
    public void generador10() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension = lt.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = lt.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = f; c < matriz[f].length; c++) {
                matriz[f][c] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public static void main(String[] args) {
        //ejercicio08//
        new generador().generador10();
    }
 }  

