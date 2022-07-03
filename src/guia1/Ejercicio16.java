package guia1;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char vocal;

        System.out.println("Ingrese una vocal");

        vocal = scan.next().charAt(0);

        switch (vocal) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("No es una vocal.");
        }
    }
}
