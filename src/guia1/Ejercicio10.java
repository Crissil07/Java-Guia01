package guia1;

import java.util.Scanner;


public class Ejercicio10 {

    
    public static void main(String[] args) {
    
        int numA, numB;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa numero entero A");
        
        numA = scan.nextInt();
        
        System.out.println("Ingresa numero entero B");
        
        numB = scan.nextInt();
        
        if (numA > numB){            
            System.out.println(numA + " es mayor a " + numB);            
        }else {            
            System.out.println(numB + " es mayor a " + numA);
        }  
              
        
    }

}
