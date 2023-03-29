/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractico.pkg3;

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
        
        Operador Calculo1 = new Operador();
        
        crearOperador(Calculo1);
        
        System.out.println("Suma = " + sumar(Calculo1));
        
        System.out.println("Resta = " + restar(Calculo1));
        
        System.out.println("Multiplicacion = " + multiplicar(Calculo1));
         if (Calculo1.getNum1() == 0 || Calculo1.getNum2() == 0){
             System.out.println("VALOR INGRESADO INVALIDO (no se multiplica por 0)");
        }
        
        System.out.println("Division = " + dividir(Calculo1));
        if (Calculo1.getNum1() == 0 || Calculo1.getNum2() == 0){
             System.out.println("VALOR INGRESADO INVALIDO (no se divide por 0)");
        }
        
    }

    private static void crearOperador(Operador Calculo1) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        Calculo1.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        Calculo1.setNum2(leer.nextInt());
        
    }

    private static int sumar(Operador Calculo1) {
       return Calculo1.getNum1() + Calculo1.getNum2();
    }
    
    private static int restar(Operador Calculo1) {
       return Calculo1.getNum1() - Calculo1.getNum2();
    }
    
    private static int multiplicar(Operador Calculo1) {
        
        if (Calculo1.getNum1() != 0 && Calculo1.getNum2() != 0){
            return Calculo1.getNum1() * Calculo1.getNum2();
        } else {     
            return 0; 
        }
       
    }
    
    private static int dividir(Operador Calculo1) {
        
       if (Calculo1.getNum1() != 0 && Calculo1.getNum2() != 0){
            return Calculo1.getNum1() / Calculo1.getNum2();
        } else {     
            return 0; 
        }
       
    }
}
