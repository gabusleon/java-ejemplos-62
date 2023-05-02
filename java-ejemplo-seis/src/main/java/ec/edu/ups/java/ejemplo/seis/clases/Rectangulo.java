/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.seis.clases;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Rectangulo extends Figura {

    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho, String tipo) {
        super(tipo);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return alto * ancho;
    }

}
