package guia1;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String buffer;
        int cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        String subcadena;
        System.out.println("Ingrese 5 caracteres para hacer funcionar el sensor");
        do {
            buffer = scan.next();
            if (buffer.substring(0, 1).equals("X") && buffer.substring(4, 5).equals("0") && buffer.length() == 5) {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }
            if (buffer.equals("&&&&&")) {
                break;
            }
        } while (!buffer.equals("&&&&&"));
        System.out.println("Lecturas correctas= " + cont1);
        System.out.println("Lecturas incorrectas= " + (cont2 - 1));
    }
}
