package guia1;

import java.util.Scanner;


public class Ejercicio22 {

    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int N, valor, valMay,valMen;
        double promedio;
        int j;
        j=1;
        valMay= 0;
        valMen= 0;
        promedio= 0;
        
        System.out.println("Ingrese la cantidad de numeros N");
        N = scan.nextInt();
       
                
        
        while (j<=N){
            
            System.out.println("Ingresa el valor del numero N " + j);
            valor = scan.nextInt();
            j++;
            
            if (valor>valMay){                
                valMay = valor;                
            }
            if (valor<valMen){
                valMen = valor;               
            }
            promedio = promedio + valor;            
        }
        promedio = promedio / N;
        System.out.println("El numero mayor es= " + valMay);
        System.out.println("El numero menor es= " + valMen);
        System.out.println("El promedio de los valores es= " + promedio);
    }
}
