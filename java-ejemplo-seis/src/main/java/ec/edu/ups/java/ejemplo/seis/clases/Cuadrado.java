/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.seis.clases;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
