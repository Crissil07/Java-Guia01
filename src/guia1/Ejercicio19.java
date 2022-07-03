package guia1;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero entre 0 y 10");

        numero = scan.nextInt();

        while (numero >= 11) {

            System.out.println("Ingrese nuevamente el numero");

            numero = scan.nextInt();
        }

        System.out.println("El numero es correcto, gracias.");
    }
}


