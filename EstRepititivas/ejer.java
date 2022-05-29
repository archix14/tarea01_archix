package EstRepititivas;

public class ejer {
    public static void ejercicio_01() {
     int numInit=01;
    while (numInit<=20) {
     System.out.println(numInit); 
     numInit=numInit+1;
      } 
     }
    public static void ejercicio_R01() {
    int numInit=01;
    do{
        System.out.println(numInit);
        numInit++;
       }while (numInit<=20);

 
    }
    public static void ejercicio_02() { 
      for (int numInit= 1; numInit <= 20; numInit++) {
          System.out.println(numInit);
          
      }
      
    }


    public static void main(String[] args) {
        System.out.println("imprime while:"); ejercicio_01();
        System.out.println("imprime Do while:"); ejercicio_01();
        System.out.println("imprime for:"); ejercicio_01();
    }  
    
}
