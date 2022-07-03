package guia1;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase;

        System.out.println("Ingrese una frase o palabra y verifica que su primera letra sea A");

        frase = scan.next();

        String Subcadena = frase.substring(0, 1);

        System.out.println(Subcadena);

        if (Subcadena.equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
