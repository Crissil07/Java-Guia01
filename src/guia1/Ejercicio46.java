package guia1;

import java.util.Scanner;


public class Ejercicio46 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [][] matriz = new int [4][4];
        int num1;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {                
                System.out.println("Ingresa el numero para la matriz fila [ " + i + " ] columna [ " + j + " ]");
                num1 = (int) (Math.random() * 50);
                matriz [i][j]= num1;                
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }    
    }
}

//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
//muestre ordenada por sus columnas.