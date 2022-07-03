package guia1;

import java.util.Scanner;


public class Ejercicio09 {

    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        int a, b, c, d, cont;
        
        System.out.println("Ingresa 4 numeros enteros diferentes entre si.");
        
        System.out.println("Numero A.");
        
        a = scan.nextInt();
        
        System.out.println("Numero B.");
        
        b = scan.nextInt();
        
        System.out.println("Numero C.");
        
        c = scan.nextInt();
        
        System.out.println("Numero D.");
        
        d = scan.nextInt();
        
        cont = b;
        b = c;
        c = a;
        a = d;
        d = cont;
                
        System.out.println("Los valores han sido alterados.");
        
        System.out.println("Numero A= " + a);
        
        System.out.println("Numero B= " + b);
        
        System.out.println("Numero C= " + c);
        
        System.out.println("Numero D= " + cont);
        
    }

}
