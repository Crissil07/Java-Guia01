package guia1;

import java.util.Scanner;


public class Ejercicio04 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Por favor, ingresa una palabra o frase.");
        
        frase = leer.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());              
        
    }

}
