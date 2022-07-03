package guia1;

import java.util.Scanner;


public class Ejercicio28 {

    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Adivina el resultado de la multiplicacion de 2 numeros entre 0 y 10.");
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int multiplicacion = num1 * num2;
        int adivina;
        do {
            adivina = scan.nextInt();
        }while (adivina != multiplicacion);
        System.out.println("Acerto el resultado");
    }
}
