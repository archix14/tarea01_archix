package trabajo_Repititivas;

import java.util.Scanner;

/*4.16.	Realice un algoritmo para obtener la tabla de multiplicar de un entero  K
comenzando desde el 1 hasta 10.*/
public class ejercicio_R03 {
   Scanner it=new Scanner(System.in);
    public static void multiplicar(String[]argumentos) {
    int num;
    System.out.println("introduce numero entero:");
    num=1;
    while (1>=num && num=<10); {
        System.out.println("\n\ntabla del "+ num);
        for (int i=1;i<=10;i++)
        System.out.println(num + "9"+ i +"="+num  );
       
    }
    
       
   }   
 

    public static void main(String[] args) {
        multiplicar();
    }
}
