/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cuatro.clases;

/**
 *
 * @author Gabus
 */
public class Persona {
    protected int codigo;
    private String nombreYApellido;
    private String direccion;

    public Persona() {
    }

    public Persona(int codigo, String nombreYApellido, String direccion) {
        this.codigo = codigo;
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public boolean verificarCodigo(){
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombreYApellido=" + nombreYApellido + ", direccion=" + direccion + '}';
    }
    
    
    
}
