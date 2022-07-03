package guia1;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero (1-4) para ver la clasificaion de la bomba");

        int tipoMotor;

        tipoMotor = scan.nextInt();

        switch (tipoMotor) {

            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para esa clasificacion de bomba");
        }
    }
}
