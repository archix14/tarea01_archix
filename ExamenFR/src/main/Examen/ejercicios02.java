package pe.edu.upeu.jaqh.Examen;

 import java.util.Scanner;

public class ejercicios02 {
   static Scanner leerT=new Scanner(System.in);
    public void ejercicio_02() {
        //Definir variables
        String cateV="";
        int cantidad=0;
        double costV=0,impUnit=0, impToltal=0, totalImpV=0;
        //Datos de entrada y proceso y salida
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cantidad Vehiculos de Categoria "+ (i+1)+": ");
            cantidad=leerT.nextInt();
            System.out.println("ingrese el precio de la categoria " +(i+1)+":");
            costV=leerT.nextDouble();
            if(i==0){
                impUnit=costV*0.12;
            }else if(i==1){
                impUnit=costV*0.08;
            }else{
                impUnit=costV*0.05;
            }
            impToltal=impUnit*cantidad;
            System.out.println("Impuesto de Categoria "+(i+1)+" es:"+impUnit);
            System.out.println("Impuesto Total de Categoria "+(i+1)+" es:"+impToltal);
            totalImpV=totalImpV+impToltal;
        }
        System.out.println("Impuesto Total de los vehiculos es :"+totalImpV);
    }
    public static void main(String[] args) {
        ejercicio02();   
    }
}
