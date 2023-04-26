/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

/**
 *
 * @author Gabus
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String direccion;
    private String correoElectronico;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String direccion, String correoElectronico) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "\nPersona{" + "cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
}
