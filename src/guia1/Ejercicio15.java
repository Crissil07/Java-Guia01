package guia1;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero (1-10) para luego ser transformado en numero romano");

        numero = scan.nextInt();

        switch (numero) {

            case 1: {
                System.out.println("El numero romano de 1 es I");
                break;
            }
            case 2: {
                System.out.println("El nuemero romano de 2 es II");
                break;
            }
            case 3: {
                System.out.println("El numero romano de 3 es III");
                break;
            }
            case 4: {
                System.out.println("El numero romano de 4 es IV");
                break;
            }
            case 5: {
                System.out.println("El numero romano de 5 es V");
                break;
            }
            case 6: {
                System.out.println("El numero romano de 6 es VI");
                break;
            }
            case 7: {
                System.out.println("El numero romano de 7 es VII");
                break;
            }
            case 8: {
                System.out.println("El numero romano de 8 es VIII");
                break;
            }
            case 9: {
                System.out.println("El numero romano de 9 es IX");
                break;
            }
            case 10: {
                System.out.println("El numero romano de 10 es X");
                break;
            }
        }
    }
}
