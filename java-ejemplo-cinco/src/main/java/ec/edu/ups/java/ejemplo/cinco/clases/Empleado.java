/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cinco.clases;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Gabus
 */
public class Empleado {
    String cedula;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String telefono;
    private String direccion;
    protected String cargo;
    
    public Empleado() {
    }

    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Empleado(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Empleado(String cedula) {
        this.cedula = cedula;
    }

    public Empleado(String cedula, String nombre, String apellido, 
            Date fechaDeNacimiento, String telefono, String direccion, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargo = cargo;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double calcularSalario(){
        return 0.00;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {        
        if (obj == null) {
            return false;
        }
        //if (this.getClass() != obj.getClass()) {
        //    return false;
        //}
        if(!(obj instanceof EmpleadoAsalariado) && 
                !(obj instanceof EmpleadoPorComision) &&
                !(obj instanceof EmpleadoPorHoras) ){
            return false;
        }
        final Empleado other = (Empleado) obj;        
        if(!this.cedula.equals(other.cedula))
            return false;
        
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento + ", telefono=" + telefono + ", direccion=" + direccion + ", cargo=" + cargo + '}';
    }    
    
}
