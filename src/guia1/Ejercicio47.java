package guia1;

import java.util.Scanner;

public class Ejercicio47 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de la matriz.");
        int nI, nJ, num1, suma1;
        nI = scan.nextInt();
        nJ = scan.nextInt();

        int[][] matriz = new int[nI][nJ];
        suma1 = 0;

        for (int i = 0; i < nI; i++) {
            for (int j = 0; j < nJ; j++) {
                System.out.println("Ingresa el numero para la matriz fila [ " + i + " ] columna [ " + j + " ]");
                num1 = (int) (Math.random() * 50);
                matriz[i][j] = num1;
                suma1 = suma1 + num1;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < nI; i++) {
            for (int j = 0; j < nJ; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        System.out.println("La suma de los valores es: " + suma1);
    }
}
