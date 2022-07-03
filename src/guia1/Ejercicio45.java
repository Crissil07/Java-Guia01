package guia1;

import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int eva1, eva2, int1, int2;
        int contAP, contRP;
        double promedio;
        int[] vector = new int[10];

        System.out.println("A continuacion se ingresaran las notas de los alumnos.");
        System.out.println("\n");

        contAP = 0;
        contRP = 0;

        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingresa las notas del alumno= [" + i + "].");
            System.out.println("Evaluativo 1.");
            eva1 = scan.nextInt();
            System.out.println("Evaluativo 2.");
            eva2 = scan.nextInt();
            System.out.println("Integrador 1.");
            int1 = scan.nextInt();
            System.out.println("Integrador 2.");
            int2 = scan.nextInt();

            promedio = eva1 * 0.1 + eva2 * 0.15 + int2 * 0.25 + int2 * 0.35;

            if (promedio >= 7) {
                System.out.println("El alumno " + i + " ha aprobado el curso con " + promedio);
                System.out.println("\n");
            } else {
                System.out.println("El alumno " + i + " ha reprobado el curso con " + promedio);
                System.out.println("\n");
            }
            if (promedio >= 7) {
                contAP = contAP + 1;
            }
            if (promedio < 7) {
                contRP = contRP + 1;
            }
        }
        System.out.println("Aprobados: " + contAP);
        System.out.println("Reprobados: " + contRP);
    }
}

//Los profesores del curso de programación de Egg necesitan llevar un registro de las
//notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
//aprobados y desaprobados. Durante el periodo de cursado se obtienen 4 notas, 2
//por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada
//nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
//del programa los profesores necesitan obtener por pantalla la cantidad de
//aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
//con promedio mayor o igual al 70% de sus notas del curso.
