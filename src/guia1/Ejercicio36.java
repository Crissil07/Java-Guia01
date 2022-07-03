package guia1;

import java.util.Scanner;


public class Ejercicio36 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros que quiere cambiar.");
        
        int euro;
        euro = scan.nextInt();  
        cambioMoneda(euro);
    }
    
    public static void cambioMoneda(int euro){
        
        
        String opc;
        double mult;
        System.out.println("Moneda a la que desea cambiar:");        
        System.out.println("A - Dolar");
        System.out.println("B - Libras");
        System.out.println("C - Yenes");
        System.out.println("\n");
        
        Scanner scan2 = new Scanner(System.in);
        opc = scan2.next();
        
        switch (opc){
            
            case "A":
                mult = euro * 1.28611;
                System.out.println("La cantidad que se le da es de " + mult + " usd.");
                break;
            case "B":
                mult = euro * 0.86;
                System.out.println("La cantidad que se le da es de " + mult + " Libras.");
                break;
            case "C":
                mult = euro * 129.852;
                System.out.println("La cantidad que se le da es de " + mult + " yenes.");
                break;
        }
    }
}
