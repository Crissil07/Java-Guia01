package guia1;

import java.util.Scanner;


public class Ejercicio24 {

    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int numero;        
        int cont1;
        
        cont1 = 0;
        
        for (int i= 1; i <= 20; i++){
         
            System.out.println("Ingrese un numero");
            numero = scan.nextInt();        
            
            if (numero == 0){                
                break;
            }
            cont1 = cont1 + numero;            
        } 
        System.out.println("Se capturo el numero 0");
        System.out.println("La suma de los numeros es= " + cont1);
    }
}

//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse