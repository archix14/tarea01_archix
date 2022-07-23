import java.util.Scanner;

/**
 * ejerciciosuma
 */
public class ejercicioMultiplicacion {
   public static void suma() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("****TABLA DE MULTIPLICACION");
    System.out.println("Ingrese Numero de la Tabla");
    int Numero=CS.nextInt();
    for (int i = 1; i < 10; i++) {
        System.out.println(Numero+"*"+1+"="+(Numero*1));

        
    }
 }
 public static void main(String[] args) {
    ejercicioMultiplicacion();
 }
 }   