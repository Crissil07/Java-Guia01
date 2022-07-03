package guia1;

import java.util.Scanner;


public class Ejercicio05 {

    
    public static void main(String[] args) {
    
        Scanner Leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero en ºC para convertilos a ºF");
        
        double numero = Leer.nextInt(),f = 32+(9 * numero)/5;
        
        System.out.println("Los ºF son " + f);     
                          
                
    }

}
