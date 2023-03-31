/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg4;

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

        Cocina receta1 = new Cocina();
        Cocina receta2 = new Cocina();
        Cocina receta3 = new Cocina();
        Cocina receta4 = new Cocina();
        Cocina receta5 = new Cocina();

        System.out.println("Ingrese el titulo de la receta 1:");
        receta1.setNombre(leer.nextLine());
        System.out.println("Lleva huevos?");
        receta1.setHuevos(leer.nextBoolean());
        System.out.println("Lleva aceite?");
        receta1.setAceite(leer.nextBoolean());
        System.out.println("Lleva papas?");
        receta1.setPapas(leer.nextBoolean());

        leer.nextLine();
        System.out.println("Ingrese el titulo de la receta 2:");
        receta2.setNombre(leer.nextLine());
        System.out.println("Lleva huevos?");
        receta2.setHuevos(leer.nextBoolean());
        System.out.println("Lleva aceite?");
        receta2.setAceite(leer.nextBoolean());
        System.out.println("Lleva papas?");
        receta2.setPapas(leer.nextBoolean());

        leer.nextLine();
        System.out.println("Ingrese el titulo de la receta 3:");
        receta3.setNombre(leer.nextLine());
        System.out.println("Lleva huevos?");
        receta3.setHuevos(leer.nextBoolean());
        System.out.println("Lleva aceite?");
        receta3.setAceite(leer.nextBoolean());
        System.out.println("Lleva papas?");
        receta3.setPapas(leer.nextBoolean());

        leer.nextLine();
        System.out.println("Ingrese el titulo de la receta 4:");
        receta4.setNombre(leer.nextLine());
        System.out.println("Lleva huevos?");
        receta4.setHuevos(leer.nextBoolean());
        System.out.println("Lleva aceite?");
        receta4.setAceite(leer.nextBoolean());
        System.out.println("Lleva papas?");
        receta4.setPapas(leer.nextBoolean());

        leer.nextLine();
        System.out.println("Ingrese el titulo de la receta 5:");
        receta5.setNombre(leer.nextLine());
        System.out.println("Lleva huevos?");
        receta5.setHuevos(leer.nextBoolean());
        System.out.println("Lleva aceite?");
        receta5.setAceite(leer.nextBoolean());
        System.out.println("Lleva papas?");
        receta5.setPapas(leer.nextBoolean());

        String eleccion;
        int busqueda;

        do {

            System.out.println("Elija que receta quiere hacer:");
            System.out.println("1 - " + receta1.getNombre());
            System.out.println("2 - " + receta2.getNombre());
            System.out.println("3 - " + receta3.getNombre());
            System.out.println("4 - " + receta4.getNombre());
            System.out.println("5 - " + receta5.getNombre());

            busqueda = leer.nextInt();

            switch (busqueda) {
                case 1:
                    if (receta1.isHuevos()) {
                        System.out.println("La receta lleva huevos.");
                    } else {
                        System.out.println("La receta no lleva huevos.");
                    }
                    if (receta1.isAceite()) {
                        System.out.println("La receta lleva aceite.");
                    } else {
                        System.out.println("La receta no lleva aceite.");
                    }
                    if (receta1.isPapas()) {
                        System.out.println("La receta lleva papas.");
                    } else {
                        System.out.println("La receta no lleva papas.");
                    }
                    break;
                case 2:
                    if (receta2.isHuevos()) {
                        System.out.println("La receta lleva huevos.");
                    } else {
                        System.out.println("La receta no lleva huevos.");
                    }
                    if (receta2.isAceite()) {
                        System.out.println("La receta lleva aceite.");
                    } else {
                        System.out.println("La receta no lleva aceite.");
                    }
                    if (receta2.isPapas()) {
                        System.out.println("La receta lleva papas.");
                    } else {
                        System.out.println("La receta no lleva papas.");
                    }
                    break;
                case 3:
                    if (receta3.isHuevos()) {
                        System.out.println("La receta lleva huevos.");
                    } else {
                        System.out.println("La receta no lleva huevos.");
                    }
                    if (receta3.isAceite()) {
                        System.out.println("La receta lleva aceite.");
                    } else {
                        System.out.println("La receta no lleva aceite.");
                    }
                    if (receta3.isPapas()) {
                        System.out.println("La receta lleva papas.");
                    } else {
                        System.out.println("La receta no lleva papas.");
                    }
                    break;
                case 4:
                    if (receta4.isHuevos()) {
                        System.out.println("La receta lleva huevos.");
                    } else {
                        System.out.println("La receta no lleva huevos.");
                    }
                    if (receta4.isAceite()) {
                        System.out.println("La receta lleva aceite.");
                    } else {
                        System.out.println("La receta no lleva aceite.");
                    }
                    if (receta4.isPapas()) {
                        System.out.println("La receta lleva papas.");
                    } else {
                        System.out.println("La receta no lleva papas.");
                    }
                    break;
                case 5:
                    if (receta5.isHuevos()) {
                        System.out.println("La receta lleva huevos.");
                    } else {
                        System.out.println("La receta no lleva huevos.");
                    }
                    if (receta5.isAceite()) {
                        System.out.println("La receta lleva aceite.");
                    } else {
                        System.out.println("La receta no lleva aceite.");
                    }
                    if (receta5.isPapas()) {
                        System.out.println("La receta lleva papas.");
                    } else {
                        System.out.println("La receta no lleva papas.");
                    }
                    break;
                default:
                    System.out.println("El numero ingresado es invalido.");
            }

            System.out.println("Desea buscar otra receta? (S/N)");
            leer.nextLine();
            eleccion = leer.nextLine();

        } while (!eleccion.equalsIgnoreCase("N"));
    }

}
