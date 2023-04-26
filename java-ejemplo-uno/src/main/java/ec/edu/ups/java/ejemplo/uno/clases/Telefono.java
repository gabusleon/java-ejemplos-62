/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.uno.clases;

/**
 *
 * @author Gabus
 */
public class Telefono {
    
    private int numero;
    private String tipo;
    //Atributos de las relaciones
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadora;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public OperadoraTelefonica getUnaOperadora() {
        return unaOperadora;
    }
    
    public void setUnaOperadora(OperadoraTelefonica unaOperadora) {
        this.unaOperadora = unaOperadora;
    }    
    
    
    
}
