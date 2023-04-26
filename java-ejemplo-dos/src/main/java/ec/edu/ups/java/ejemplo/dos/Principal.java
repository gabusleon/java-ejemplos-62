/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.dos;

import ec.edu.ups.java.ejemplo.dos.clases.Direccion;
import ec.edu.ups.java.ejemplo.dos.clases.Persona;
import java.util.GregorianCalendar;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void main(String[] args) {
        //instanciamos dirección con constructor vacío
        Direccion direccionUno = new Direccion();
        direccionUno.setCalle1("Calle Vieja");
        direccionUno.setCalle2("Elia Liut");
        direccionUno.setNumero(1230);
        
        //instanciamos dirección con constructor calle1 y calle2
        Direccion direccionDos = new Direccion("Callesita uno", "Callesita dos");
        direccionDos.setNumero(1234);
        
        //instanciamos dirección con constructor que recibe todos los atributos
        Direccion direccionTres = new Direccion("C1", "C2", 7890);
        
        //instanciamos una persona
        Persona pepito = new Persona("010101", "Pepito");
        //instanciamos una fecha tipo GregorianCalendar
        GregorianCalendar fechaNac = new GregorianCalendar(2003, 1, 10);
        //asignamos la fecha al objeto pepito
        pepito.setFechaNacimiento(fechaNac);
        //agregamos las direcciones al objeto pepito
        pepito.agregarDireccion(direccionUno);
        pepito.agregarDireccion(direccionDos);
        pepito.agregarDireccion(direccionTres);
        
        System.out.println("Datos de persona:");
        System.out.println(pepito);
                
    }
}
