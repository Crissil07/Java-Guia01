package guia1;

import java.util.Scanner;


public class Ejercicio39 {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [] vector = new int [100];
        
        for (int i = 99 ; i >= 0; i--){
            vector [i]= i;
            System.out.println(vector[i]);
        }
    }
}
