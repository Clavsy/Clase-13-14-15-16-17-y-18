/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg4;

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
        
        Rectangulo figura1 = new Rectangulo();
        
        crearRectangulo(figura1);
        System.out.println(" ");
        calcularSuperficie(figura1);
        calculaPerimetro(figura1);
        System.out.println(" ");
        graficarRectangulo(figura1);
    }

    private static void crearRectangulo(Rectangulo figura1) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo:");
        figura1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo:");
        figura1.setAltura(leer.nextDouble());
        
    }

    private static void calcularSuperficie(Rectangulo figura1) {
        System.out.println("Superficie = " + figura1.calcularSuperficie());
    }

    private static void calculaPerimetro(Rectangulo figura1) {
        System.out.println("Perimetro = " + figura1.calcularPerimetro());
    }

    private static void graficarRectangulo(Rectangulo figura1) {
        figura1.graficarRectangulo();
    }
    
}
