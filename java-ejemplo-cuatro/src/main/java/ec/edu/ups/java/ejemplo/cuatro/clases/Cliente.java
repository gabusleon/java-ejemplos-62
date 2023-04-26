/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cuatro.clases;

/**
 *
 * @author Gabus
 */
public class Cliente extends Persona {
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String tipoCliente, int codigo, String nombreYApellido, 
            String direccion) {
        super(codigo, nombreYApellido, direccion);
        this.tipoCliente = tipoCliente;
    }
        
    public Cliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Cliente{" + "tipoCliente=" + tipoCliente + '}';
    }
    
    
}
