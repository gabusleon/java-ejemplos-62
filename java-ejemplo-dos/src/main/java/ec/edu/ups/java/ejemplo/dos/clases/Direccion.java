/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.dos.clases;

/**
 *
 * @author Gabus
 */
public class Direccion {
    private String calle1;
    private String calle2;
    private int numero;

    public Direccion() {
    }

    public Direccion(String calle1, String calle2, int numero) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
    }

    public Direccion(String calle1, String calle2) {
        this.calle1 = calle1;
        this.calle2 = calle2;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle1=" + calle1 + ", calle2=" + calle2 + ", numero=" + numero + '}';
    }
    
    
}
