package guia1;

import java.util.Scanner;


public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        int numero;
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es par o no");
        
        numero = scan.nextInt();
        
        if (numero % 2 == 0){            
            System.out.println("El numero es par");            
        }else {
            System.out.println("El numero es impar");
        }      
                
    }

}
