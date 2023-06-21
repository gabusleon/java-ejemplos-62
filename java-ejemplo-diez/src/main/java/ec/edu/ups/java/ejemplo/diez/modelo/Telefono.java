/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.modelo;

import java.util.Objects;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Telefono {
    
    private String numero;
    private TipoTelefono tipo;
    //relaciones de agregación
    private Persona unaPersona;
    private Operadora unaOperada;

    public Telefono() {
    }

    public Telefono(String numero, TipoTelefono tipo) {
        this.numero = numero;
        this.tipo = tipo;        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefono tipo) {
        this.tipo = tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public Operadora getUnaOperada() {
        return unaOperada;
    }

    public void setUnaOperada(Operadora unaOperada) {
        this.unaOperada = unaOperada;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + ", unaPersona=" + unaPersona + ", unaOperada=" + unaOperada + '}';
    }            
    
}
