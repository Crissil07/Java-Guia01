package guia1;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cont1;
        int dividendo, divisor;

        System.out.println("Ingresa 2 numeros para realizar una division por resta.");
        System.out.println("Ingresa el dividendo.");
        dividendo = scan.nextInt();
        System.out.println("Ingresa el divisor");
        divisor = scan.nextInt();

        cont1 = 0;

        while (dividendo >= divisor) {

            dividendo = dividendo - divisor;
            cont1 = cont1 + 1;
        }
        System.out.println("El residuo es: " + dividendo + ", el numero de restas realizadas es: " + cont1);
    }
}
