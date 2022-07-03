package guia1;

import java.util.Scanner;


public class Ejercicio07 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero para elevarlo al cuadrado, al cubo y calcular su raiz cuadrada.");
        
        int numero = leer.nextInt(), expo1 = 2 , expo2 = 3;
        
        double raiz = Math.sqrt(numero);
        
        double potencia1 = Math.pow(numero,expo1), potencia2 = Math.pow(numero,expo2);
        
        System.out.println("El cuadrado del numero es " + potencia1 + ", el cubo es " + potencia2 + ", y su raiz es " + raiz);
                               
                            
    }

}
