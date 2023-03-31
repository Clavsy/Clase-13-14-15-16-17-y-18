/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg4nuevo;

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
        
        Cuenta usuario1 = new Cuenta();
        
        System.out.println("Ingrese nombre de usuario:");
        usuario1.setTitular(leer.nextLine());
        System.out.println("Ingrese saldo del usuario:");
        usuario1.setSaldo(leer.nextInt());
        
        usuario1.retirarDinero();
    }
}
