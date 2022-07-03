package guia1;

import java.util.Scanner;


public class Ejercicio08 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el tiempo en minutos, y asi calcular su equivalencia en dias, horas y minutos.");
        
        double numero = leer.nextInt();
        
        double dias, horas, minutos;
        
        dias=(numero/24)/60;
        horas= (numero/60)%24;
        minutos= numero%60;
        
        System.out.println("Dias= " + dias + " horas= " + horas + " minutos= " + minutos );                    
            
    }

}
