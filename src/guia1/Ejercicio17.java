package guia1;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la clase de socio(a,b,c) de su obra social para calcular costos");

        char letra;

        letra = scan.next().charAt(0);

        switch (letra) {

            case 'a':
            case 'A':
                System.out.println("Ingrese el valor del tratamiento");
                double valorA;
                double vfinalA;
                valorA = scan.nextDouble();
                vfinalA = valorA - (valorA * 0.5);
                System.out.println("El monto a abonar es de " + vfinalA);
                break;
            case 'b':
            case 'B':
                System.out.println("Ingrese el valor del tratamiento");
                double valorB;
                double vfinalB;
                valorB = scan.nextDouble();
                vfinalB = valorB - (valorB * 0.35);
                System.out.println("El monto a abonar es de " + vfinalB);
                break;
            case 'c':
            case 'C':
                System.out.println("Ingrese el valor del tratamiento");
                double valorC;
                valorC = scan.nextDouble();
                System.out.println("Su clase de socio no tiene descuento, el monto a abonar es " + valorC);
                break;
        }
    }
}
