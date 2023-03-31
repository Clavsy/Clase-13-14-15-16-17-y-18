/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg5;

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
        
        Empleado empleado1 = new Empleado();
        
        System.out.println("Ingrese nombre del empleado:");
        empleado1.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad:");
        empleado1.setEdad(leer.nextInt());
        System.out.println("Ingrese su salario:");
        empleado1.setSalario(leer.nextDouble());
        
        empleado1.calcularAumento();
    }
    
}
