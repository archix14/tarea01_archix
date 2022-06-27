package pe.edu.upeu.jaqh.Examen;

 import java.util.Scanner;

/**
 * ejercicio04
 */
public class ejercicio04 {
    Scanner leer=new Scanner(System.in);
   public void jeercicio4() {
    int i, j, suma, sec = 0;
    System.out.println("Ingrese cuantos numeros perfectos desea ver (dentro del rango): ");
    int canti = leer.nextInt();
    System.out.println("Los numero perfectos son: ");
    for (i = 1; i > 0; i++) {

        suma = 0;
        for (j = 1; j < i; j++) {
            if (i % j == 0) {
                suma = suma + j;
            }
        }
        if (i == suma) {

            sec++;
            if (sec <= canti) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
   }
   public static void main(String[] args) {
    ejeercicio4();
   } 
}
