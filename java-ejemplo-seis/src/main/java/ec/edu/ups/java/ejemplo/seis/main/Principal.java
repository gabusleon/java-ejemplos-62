/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.seis.main;

import ec.edu.ups.java.ejemplo.seis.clases.Circulo;
import ec.edu.ups.java.ejemplo.seis.clases.Cuadrado;
import ec.edu.ups.java.ejemplo.seis.clases.Figura;
import ec.edu.ups.java.ejemplo.seis.clases.Rectangulo;
import ec.edu.ups.java.ejemplo.seis.clases.Triangulo;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[10];
        
        for (int i = 0; i < 10; i++) {
            double aleatorio = Math.random();
            if(aleatorio > 0.75){
                figuras[i] = new Rectangulo(10, 10, "Rectangulo");
            }else if(aleatorio > 0.50){
                figuras[i] = new Circulo(5, "Circulo");
            }else if(aleatorio > 0.25){
                figuras[i] = new Cuadrado(7, "Cuadrado");
            }else{
                figuras[i] = new Triangulo(10, 5, "Triangulo");
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Tipo de figura: " + figuras[i].getTipo());
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println();
        }
    }
}
