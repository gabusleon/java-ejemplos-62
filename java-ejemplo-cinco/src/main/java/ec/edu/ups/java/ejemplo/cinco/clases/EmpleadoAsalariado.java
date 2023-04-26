/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.cinco.clases;

/**
 *
 * @author Gabus
 */
public class EmpleadoAsalariado extends Empleado {

    private int aniosAntiguedad;
    private double salario;
    private int cargasFamiliares;
    
    public EmpleadoAsalariado(){
        
    }

    public EmpleadoAsalariado(int aniosAntiguedad, int salario, int cargasFamiliares, String cedula, String nombre, String apellido, String cargo) {
        super(cedula, nombre, apellido);                        
        super.cargo = cargo;
        this.aniosAntiguedad = aniosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;        
    } 

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }

    @Override
    public double calcularSalario() {
        
    }
    
    public double calcularSalario(double extra){
        
    }
    
    

}
