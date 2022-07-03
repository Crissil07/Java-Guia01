package guia1;

import java.util.Scanner;


public class Ejercicio40 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el indice de un vector.");
        int n,suma;
        n = scan.nextInt();
        int [] vector = new int [n];
        
        System.out.println("Ingresa los valores de los vectores para ser sumados");
        
        suma = 0;
        
        for (int i=0; i < vector.length ; i++){
            int num1;
            num1 = scan.nextInt();
            vector[i] = num1;
            suma = suma + num1;
        }
        System.out.println("La suma es= " + suma);
    }

}
