package guia1;

import java.util.Scanner;


public class Ejercicio06 {

    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Calcula el salario de un trabajador.");
        
        System.out.println("Ingresa el valor de la hora de trabajo.");
        
        double valhr = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de horas trabajadas.");
        
        double hrTrab = leer.nextInt();
        
         System.out.println("El sueldo es " + (valhr * hrTrab) * 24);
              
        
        
        
    }

}
