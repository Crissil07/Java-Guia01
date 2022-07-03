package guia1;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numLimite;

        int resultado = 0;

        System.out.println("Ingrese un numero como valor limite");

        numLimite = scan.nextInt();

        while (resultado <= numLimite) {

            int numero;

            System.out.println("Ingrese un numero hasta llegar al limite o superarlo");

            numero = scan.nextInt();

            resultado = resultado + numero;
        }
        System.out.println("Fin");

        System.out.println("Valor final= " + resultado);
    }
}
