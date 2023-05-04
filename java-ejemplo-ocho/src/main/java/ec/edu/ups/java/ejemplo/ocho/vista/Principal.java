/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.ocho.vista;

import ec.edu.ups.java.ejemplo.ocho.controlador.ControladorPersona;
import ec.edu.ups.java.ejemplo.ocho.controlador.IControlador;
import ec.edu.ups.java.ejemplo.ocho.modelo.Persona;
import java.util.GregorianCalendar;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Principal {

    public static void main(String[] args) {
        IControlador controlador = new ControladorPersona();
        
        Persona p1 = new Persona("0101", "Pepito", "Perez", new GregorianCalendar(2000, 1, 14));
        Persona p2 = new Persona("0202", "Juanito", "Perez", new GregorianCalendar(2000, 5, 3));
        Persona p3 = new Persona("0303", "Jaimito", "Perez", new GregorianCalendar(2000, 6, 14));
        
        controlador.create(p1);
        controlador.create(p2);
        controlador.create(p3);
        
        System.out.println("Listar todos");
        controlador.list();
        System.out.println("-----");
        System.out.println("Buscar persona con ceedula 0202");
        System.out.println(controlador.read("0202"));
        System.out.println("-----");
        System.out.println("Actualizar apellido ");
        p3.setApellido("Gonzalez");
        controlador.update(p3);
        controlador.list();
        System.out.println("-----");
        System.out.println("Eliminar persona p1");
        controlador.delete(p1);
        controlador.list();
        System.out.println("-----");
    }
}
