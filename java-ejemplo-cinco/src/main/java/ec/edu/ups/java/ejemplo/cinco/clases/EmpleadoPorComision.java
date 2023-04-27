/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cinco.clases;

/**
 *
 * @author Gabus
 */
public class EmpleadoPorComision extends Empleado {

    private double totalDeVentas;
    private double porcentajeComision;
    private double salario;
    
    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double totalDeVentas, double porcentajeComision, double salario, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.totalDeVentas = totalDeVentas;
        this.porcentajeComision = porcentajeComision;
        this.salario = salario;
    }

    public double getTotalDeVentas() {
        return totalDeVentas;
    }

    public void setTotalDeVentas(double totalDeVentas) {
        this.totalDeVentas = totalDeVentas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario + (totalDeVentas*(porcentajeComision/100));
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleadoPorComision{" + "totalDeVentas=" + totalDeVentas + ", porcentajeComision=" + porcentajeComision + ", salario=" + salario + '}';
    }
    
    

}
