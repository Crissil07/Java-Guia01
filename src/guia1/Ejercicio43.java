package guia1;

import java.util.Scanner;


public class Ejercicio43 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int N,num1,suma;
        System.out.println("Ingresa el tamaño de un vector.");              
        N = scan.nextInt();
        int [] vector = new int [N];
        System.out.println("\n");
        
        for (int i = 0; i < vector.length; i++){            
            int num2 = (int) (Math.random() * N);            
            vector[i] = num2;
            System.out.print("[" + num2 + "]"); 
        }
        
        System.out.println("\n");
        System.out.println("Ingresa el numero a buscar.");
        num1 = scan.nextInt();
        System.out.println("\n");
        suma=0;
        
        for (int i = 0; i < vector.length; i++){            
            if (num1 == vector[i]){
                System.out.println("Se encontro el numero en la posicion [" + (i+1) + "]");
                suma = suma +1;                
            }
        }
        if (suma == 0){
            System.out.println("No se encontro el numero.");
        }
    }
}
