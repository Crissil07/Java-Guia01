package guia1;

import java.util.Scanner;


public class Ejercicio03 {

    
    public static void main(String[] args) {
    
        Scanner Leer = new Scanner(System.in);
        
        String nombre;    
                
        System.out.println("Hola. Por favor ingresa tu nombre.");
        
        nombre = Leer.next();
        
        System.out.println("Te llamas " + nombre );    
                
    }

}
