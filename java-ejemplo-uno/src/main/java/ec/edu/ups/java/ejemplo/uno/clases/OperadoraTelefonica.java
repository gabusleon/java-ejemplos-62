/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.uno.clases;

/**
 *
 * @author Gabus
 */
public class OperadoraTelefonica {
    
    private int codigo;
    private String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }        

    @Override
    public String toString() {
        return "OperadoraTelefonica{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
