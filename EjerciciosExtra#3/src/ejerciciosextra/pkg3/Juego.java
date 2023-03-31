/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg3;

import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class Juego {

    private String iniciar_juego;
    
    public String getIniciar_juego() {
        return iniciar_juego;
    }

    public void setIniciar_juego(String iniciar_juego) {
        this.iniciar_juego = iniciar_juego;
    }

    public Juego(String iniciar_juego) {
        this.iniciar_juego = iniciar_juego;
    }

    public Juego() {
    }
    
    public void Jugar(){
        
        Scanner leer = new Scanner(System.in);
        
        int numSecreto;
        int entrada;
        int intentos = 0;
        
        if(iniciar_juego.equalsIgnoreCase("S")){
            
            System.out.println("Jugador 1, ingrese el numero secreto:");
            System.out.println("El numero debe estar entre 1 y 10...");
            numSecreto = leer.nextInt();
            
            while(numSecreto < 1 || numSecreto > 10){
                System.out.println("NUMERO INGRESADO INVALIDO. Intente nuevamente:");
                numSecreto = leer.nextInt();
            }
            
            for (int i = 0; i < 20; i++) {
                System.out.println(" ");
            }
            
            System.out.println("REGLAS!");
            System.out.println("El Jugador 2 tiene que adivinar el numero secreto.");
            System.out.println("Tiene 5 intentos!");
            System.out.println("El numero esta entre 1 y 10...");
            
            for (int i = 0; i < 5; i++) {
                
                intentos++;
                System.out.println("Intento #" + intentos);
                entrada = leer.nextInt();
                
                if(entrada == numSecreto){
                    
                    System.out.println(" ");
                    System.out.println("SUCCES!");
                    i = 5;
                    System.out.println("Numero secreto: " + numSecreto);
                    System.out.println("Intentos: " + intentos);
                    
                } else {
                    
                    System.out.println("Incorrecto!");    
                } 
            }
            
            intentos++;
            if(intentos == 6){
                System.out.println(" ");
                System.out.println("YOU LOSE!");
                System.out.println("Te quedaste sin intentos!" );
                System.out.println("Numero secreto: " + numSecreto);
            }
        } 
    }
}
