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
public class Cuenta {
    
    private int saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirarDinero(){
        
        Scanner leer = new Scanner(System.in);
        int retiro;
        
        System.out.println("Cuanto dinero quiere retirar? (MAX: " + saldo + ")");
        retiro = leer.nextInt();
        
        if(retiro <= saldo){
            saldo -= retiro;
            System.out.println("Saldo actual de " + titular + ": " + saldo);
        } else {
            System.out.println("Su saldo no es suficiente.");
        }
        
    }
    
}
