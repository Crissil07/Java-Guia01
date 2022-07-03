package guia1;

import java.util.Scanner;


public class Ejercicio02 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Hola. Por favor, ingresa 2 numeros para ser sumados");
        
        int numero1 = leer.nextInt(), numero2 = leer.nextInt(), suma = numero1 + numero2;
        
        System.out.println("la suma es " + suma ); 
        
    }

}
