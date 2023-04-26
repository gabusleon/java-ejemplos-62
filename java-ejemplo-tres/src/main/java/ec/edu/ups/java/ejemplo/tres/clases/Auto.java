/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.tres.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabus
 */
public class Auto {
    private String placa;
    private String modelo;
    private String marca;
    //atributo de la relación de composición
    private List<Rueda> ruedas;

    public Auto() {
        this.ruedas = new ArrayList<>();
    }

    public Auto(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ruedas = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void agregarRueda(String marca, String diametro){
        ruedas.add(new Rueda(marca, diametro));
    }

    public List<Rueda> getRuedas() {
        return ruedas;
    }        

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", ruedas=" + ruedas + '}';
    }          
}
