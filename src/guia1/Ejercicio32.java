package guia1;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero para definir el lado del cuadrado.");
        n = scan.nextInt();

        //fila superior 0
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");
        //Parte media        
        for (int i = 0; i < n - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //fila inferior 3
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }
}
