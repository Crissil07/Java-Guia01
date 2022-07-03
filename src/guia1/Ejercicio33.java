package guia1;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Nf, Nh, Ed, cont1, cont2;
        double media;

        System.out.println("Ingrese el numero de familias a analizar.");
        Nf = scan.nextInt();
        cont1 = 0;

        for (int i = 1; i <= Nf; i++) {
            System.out.println("Ingresa la cantidad de hijos de la familia " + i);
            Nh = scan.nextInt();
            cont1 = cont1 + Nh;
        }
        System.out.println("La cantidad de hijos es= " + cont1);
        cont2 = 0;
        for (int j = 1; j <= cont1; j++) {
            System.out.println("Ingrese la edad del hijo " + j);
            Ed = scan.nextInt();
            cont2 = cont2 + Ed;
        }
        System.out.println("La edad promedio de los hijos de " + Nf + " familias es " + (media = cont2 / cont1));
    }
}
