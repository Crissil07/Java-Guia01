package guia1;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase;

        String frase2 = "eureka";

        System.out.println("Ingrese una frase");

        frase = scan.next();

        if (frase.equals(frase2)) {
            System.out.println("La frase coincide, es correcto");
        } else {
            System.out.println("Incorrecto, no coincide la frase");
        }
    }
}
