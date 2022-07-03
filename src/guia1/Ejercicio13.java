package guia1;

import java.util.Scanner;


public class Ejercicio13 {

    
    public static void main(String[] args) {
    
        Scanner scan= new Scanner(System.in);
        
        String frase;    
                
        System.out.println("Ingrese una palabra o frase no mayor a 8 caracteres (los espacios no cuentan)");
        
        frase = scan.next();
        
        int longitud = frase.length();
        
        if (longitud <= 8) {
            
            System.out.println("Correcto");
            
        }else {
            
            System.out.println("Incorrecto");
        }
        
    }

}
