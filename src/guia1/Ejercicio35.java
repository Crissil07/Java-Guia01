package guia1;

import java.util.Scanner;


public class Ejercicio35 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese N1");
        int num1 = scan.nextInt();
        System.out.println("Ingrese N2");
        int num2 = scan.nextInt();
        
        System.out.println("\n");
        System.out.println("Ingrese que operacion desea realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("\n");
        int opc = scan.nextInt();
        
        switch (opc){
            
            case 1:
                System.out.println(sumaNumeros(num1,num2));
                break;
            case 2:
                System.out.println(restaNumeros(num1,num2));
                break;
            case 3:
                System.out.println(multiNumeros(num1,num2));
                break;
            case 4:
                System.out.println(diviNumeros(num1,num2));
                break;
        }
                
    }
    
    public static int sumaNumeros(int num1, int num2){
        int suma;        
        suma = num1 + num2;
        return suma;        
    }
    
    public static int restaNumeros(int num1, int num2){
        int resta;
        resta = num1 - num2;
        return resta;
    }
    
    public static int multiNumeros(int num1, int num2){
        int multiplicacion;
        multiplicacion = num1 * num2;
        return multiplicacion;        
    }
    
    public static int diviNumeros(int num1, int num2){
        int division;
        division = num1 / num2;
        return division;
    }
    
}
