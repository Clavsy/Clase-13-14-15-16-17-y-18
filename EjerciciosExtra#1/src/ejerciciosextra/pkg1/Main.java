/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg1;

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
        Cancion cancion1 = new Cancion();
        
        System.out.println("Ingrese el autor de la cancion:");
        cancion1.setAutor(leer.nextLine());
        System.out.println("Ingrese el nombre de la cancion:");
        cancion1.setTitulo(leer.nextLine());
        
        System.out.println("Cancion ingresada:");
        System.out.println(cancion1.getAutor() + " - " + cancion1.getTitulo());
    }
}
