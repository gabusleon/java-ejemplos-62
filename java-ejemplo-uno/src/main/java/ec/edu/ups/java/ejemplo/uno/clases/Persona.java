/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.uno.clases;

import java.util.Date;

/**
 *
 * @author Gabus
 */
public class Persona {
    
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    
    public int calcularEdad(Date fechaActual){
        return 0;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString(){
        String resultado = "Cedula: " + cedula + 
                ", Nombre: " + nombre + 
                ", Fecha de Nacimiento: " + fechaNacimiento.toString();
        return resultado;
    }
    
}
