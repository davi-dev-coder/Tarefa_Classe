
package com.mycompany.desafios;
import java.util.Scanner;

//calcula a área do círculo com base no raio
public class Desafios {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio = teclado.nextDouble();
        double area = pi*raio*raio;
        
        System.out.printf("A=%.4f\n", area);
    }
}
