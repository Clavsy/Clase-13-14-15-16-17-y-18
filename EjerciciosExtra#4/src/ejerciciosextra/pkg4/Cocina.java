/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextra.pkg4;

/**
 *
 * @author clavs
 */
public class Cocina {

    private String nombre;
    private boolean huevos;
    private boolean aceite;
    private boolean papas;

    public Cocina() {
    }

    public Cocina(String nombre, boolean huevos, boolean aceite, boolean papas) {
        this.nombre = nombre;
        this.huevos = huevos;
        this.aceite = aceite;
        this.papas = papas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isHuevos() {
        return huevos;
    }

    public void setHuevos(boolean huevos) {
        this.huevos = huevos;
    }

    public boolean isAceite() {
        return aceite;
    }

    public void setAceite(boolean aceite) {
        this.aceite = aceite;
    }

    public boolean isPapas() {
        return papas;
    }

    public void setPapas(boolean papas) {
        this.papas = papas;
    }

}
