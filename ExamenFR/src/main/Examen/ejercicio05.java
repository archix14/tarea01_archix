package pe.edu.upeu.jaqh.Examen;

import java.util.Scanner;

/**
 * ejercicio05
 */
public class ejercicio5 {
    Scanner leerT=new Scanner(System.in);

    public void ejercicio05() {
    
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = leerT.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejercicio5_2(n);
    }

    public static void ejercicio5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejercicio5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
    public static void main(String[] args) {
        ejercicio5_2();  
        
    }
}
