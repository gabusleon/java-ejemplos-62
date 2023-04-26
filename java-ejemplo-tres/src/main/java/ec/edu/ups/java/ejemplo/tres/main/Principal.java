/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.tres.main;

import ec.edu.ups.java.ejemplo.tres.clases.Auto;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void main(String[] args) {
        Auto auto = new Auto("abf-1234", "camaro", "chevrolet");
        auto.agregarRueda("Michellin1", "17");
        auto.agregarRueda("Michellin2", "17");
        auto.agregarRueda("Michellin3", "17");
        auto.agregarRueda("Michellin4", "17");
        
        System.out.println("Datos: " + auto.toString());
        System.out.println("Info de ruedas: " + auto.getRuedas());
    }
}
