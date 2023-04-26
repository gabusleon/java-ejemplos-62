/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

/**
 *
 * @author Gabus
 */
public class Empleado extends Persona {
    private double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo, String cedula, String nombre, String direccion, String correoElectronico) {
        super(cedula, nombre, direccion, correoElectronico);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleado{" + "sueldo=" + sueldo + '}';
    }
    
    
}
