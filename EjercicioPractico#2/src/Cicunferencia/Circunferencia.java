/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cicunferencia;

/**
 *
 * @author clavs
 */
public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {

       // Tambien puede ser:
       // System.out.println(Math.pow(Math.PI * radio,2));
        
        return (Math.PI * radio) * (Math.PI * radio);
    }
    
    public double calcularPerimetro() {
        return (Math.PI * radio * 2);
    }
}
