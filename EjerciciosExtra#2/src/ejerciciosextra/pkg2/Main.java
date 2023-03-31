/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg2;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Puntos calculo1 = new Puntos();
        
        System.out.println("Ingrese el valor de X1:");
        calculo1.setX1(leer.nextInt());
        System.out.println("Ingrese el valor de Y1:");
        calculo1.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de X2:");
        calculo1.setX2(leer.nextInt());
        System.out.println("Ingrese el valor de Y2:");
        calculo1.setY2(leer.nextInt());
        
        calcularDistancia(calculo1);
    }

    private static void calcularDistancia(Puntos calculo1) {
        System.out.println("La distancia entre ambos puntos es = " + calculo1.calcularDistancia());
    }
    
}
