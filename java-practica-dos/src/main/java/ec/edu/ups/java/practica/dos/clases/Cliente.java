/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

/**
 *
 * @author Gabus
 */
public class Cliente extends Persona {
    
    private String telefono;

    public Cliente() {
    }

    public Cliente(String telefono, String cedula, String nombre, String direccion, String correoElectronico) {
        super(cedula, nombre, direccion, correoElectronico);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cliente{" + "telefono=" + telefono + '}';
    }
    
    
    
}
