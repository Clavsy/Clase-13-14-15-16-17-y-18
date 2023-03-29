/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

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

        Libro l1 = new Libro();

        rellenarLibro(l1);
        mostrarLibro(l1);
    }

    private static void rellenarLibro(Libro l1) {

        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE LOS DATOS DEL LIBRO:");
        System.out.println("Titulo:");
        l1.titulo = leer.nextLine();
        System.out.println("Autor:");
        l1.autor = leer.nextLine();
        System.out.println("ISBN:");
        l1.ISBN = leer.nextLong();
        System.out.println("Numero de paginas:");
        l1.numPag = leer.nextInt();

    }

    private static void mostrarLibro(Libro l1) {
        System.out.println(l1.toString());
    }
}
