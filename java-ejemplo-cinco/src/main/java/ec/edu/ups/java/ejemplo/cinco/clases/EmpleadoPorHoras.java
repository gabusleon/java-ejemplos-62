/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cinco.clases;

import java.util.Date;

/**
 *
 * @author Gabus
 */
public class EmpleadoPorHoras extends Empleado {
    
    private int numeroDeHorasTrabajadas;
    private double valorHoraTrabajada;

    public EmpleadoPorHoras(int numeroDeHorasTrabajadas, double valorHoraTrabajada, String cedula, String nombre, String apellido, Date fechaDeNacimiento, String telefono, String direccion, String cargo) {
        super(cedula, nombre, apellido);
        this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public int getNumeroDeHorasTrabajadas() {
        return numeroDeHorasTrabajadas;
    }

    public void setNumeroDeHorasTrabajadas(int numeroDeHorasTrabajadas) {
        this.numeroDeHorasTrabajadas = numeroDeHorasTrabajadas;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    @Override
    public double calcularSalario() {
        return numeroDeHorasTrabajadas * valorHoraTrabajada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleadoPorHoras{" + "numeroDeHorasTrabajadas=" + numeroDeHorasTrabajadas + ", valorHoraTrabajada=" + valorHoraTrabajada + '}';
    }
    
    

}
