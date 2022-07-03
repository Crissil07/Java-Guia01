package guia1;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, resultado;
        int N;
        String Letra;
        boolean menu = false;

        while (menu == false) {

            System.out.println("MENU");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");

            N = scan.nextInt();

            System.out.println("\n");

            if (N >= 1 & N <= 5) {

                switch (N) {
                    case 1:
                        System.out.println("Ingrese Numero A");
                        num1 = scan.nextDouble();
                        System.out.println("Ingrese Numero B");
                        num2 = scan.nextDouble();
                        resultado = num1 + num2;
                        System.out.println("La suma es= " + resultado);
                        System.out.println("\n");
                        break;                        
                    case 2:
                        System.out.println("Ingrese Numero A");
                        num1 = scan.nextDouble();
                        System.out.println("Ingrese Numero B");
                        num2 = scan.nextDouble();
                        resultado = num1 - num2;
                        System.out.println("La resta es= " + resultado);
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Ingrese Numero A");
                        num1 = scan.nextDouble();
                        System.out.println("Ingrese Numero B");
                        num2 = scan.nextDouble();
                        resultado = num1 * num2;
                        System.out.println("La multiplicacion es= " + resultado);
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Ingrese Numero A");
                        num1 = scan.nextDouble();
                        System.out.println("Ingrese Numero B");
                        num2 = scan.nextDouble();
                        resultado = num1 / num2;
                        System.out.println("La division es= " + resultado);
                        System.out.println("\n");
                        break;
                    case 5:
                        System.out.println("¿Desea salir del programa? S/N");
                        Letra = scan.next();
                        if (Letra.equals("S") || Letra.equals("s")) {
                            menu = true;
                            System.out.println("Gracias por utilizar el programa");
                        }
                        System.out.println("\n");
                        break;
                }
            }
        }
    }
}
