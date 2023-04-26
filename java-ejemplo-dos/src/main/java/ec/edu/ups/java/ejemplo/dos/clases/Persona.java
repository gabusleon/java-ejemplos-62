/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.dos.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Gabus
 */
public class Persona {

    private String cedula;
    private String nombre;
    private GregorianCalendar fechaNacimiento;
    //atributos de la relación de Agregación
    private List<Direccion> direcciones;

    //constructor vacío
    public Persona() {
        this.direcciones = new ArrayList<>();
    }

    //constructor con todos los atributos
    public Persona(String cedula, String nombre,
            GregorianCalendar fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direcciones = new ArrayList<>();
    }

    //constructor pasando la cedula y nombre
    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direcciones = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void agregarDireccion(Direccion dir){
        direcciones.add(dir);
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return "Persona{" + "cedula=" + 
                cedula + ", nombre=" + 
                nombre + ", fechaNacimiento=" + 
                format.format(fechaNacimiento.getTime()) + ", direcciones=" + 
                direcciones + '}';
    }

  
    
    
}
