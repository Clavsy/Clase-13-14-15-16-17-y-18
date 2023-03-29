/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cicunferencia;

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
        
        Circunferencia circulo1 = new Circunferencia();
        
        crearCircunferencia(circulo1);
        calcularArea(circulo1);
        calcularPerimetro(circulo1);
    }

    private static void crearCircunferencia(Circunferencia circulo1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo:");
        circulo1.setRadio(leer.nextDouble());
    }

    private static void calcularArea(Circunferencia circulo1) {
        System.out.println("Area = " + circulo1.calcularArea());
    }

    private static void calcularPerimetro(Circunferencia circulo1) {
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());
    }

    
}
