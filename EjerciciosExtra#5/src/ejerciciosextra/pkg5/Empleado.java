/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg5;

/**
 *
 * @author clavs
 */
public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularAumento(){
        
        if(edad >= 30){
            System.out.println("Salario anterior: " + salario);
            salario = salario * 1.1;
            System.out.println("Salario actual (con aumento): " + salario);
        } else {
            System.out.println("Salario anterior: " + salario);
            salario = salario * 1.05;
            System.out.println("Salario actual (con aumento): " + salario);
        }
        
    }
}
