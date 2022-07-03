package guia1;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N;
        double altura;
        double cont1 = 0; //Alturas menores a 1.6m      
        double cont2 = 0;//Alturas todas
        int i = 0;
        int j = 1; //va desde 1 a N

        System.out.println("Ingresa la cantidad de alumnos.");

        N = scan.nextInt();

        while (j <= N) {

            System.out.println("Ingrese la altura del alumno " + j);
            altura = scan.nextDouble();

            if (altura < 1.60) {
                cont1 = cont1 + altura;
                i++;
            }
            cont2 = cont2 + altura;
            j++;
        }
        cont1 = cont1 / i;
        cont2 = cont2 / N;
        System.out.println("El promedio menor a 1,60 es= " + cont1);
        System.out.println("El promedio general es= " + cont2);
    }
}
