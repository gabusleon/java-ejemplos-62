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
        double pagoAntiguedad = 0.00;
        double pagoCargasFamiliares = 0.00;
        
        if(aniosAntiguedad >= 2 && aniosAntiguedad <= 5){
            pagoAntiguedad = 80;
        }else if(aniosAntiguedad >= 6 && aniosAntiguedad <= 8){
            pagoAntiguedad = 120;
        }else if(aniosAntiguedad >= 9 && aniosAntiguedad <= 14){
            pagoAntiguedad = 130;
        }else if(aniosAntiguedad >= 15){
            pagoAntiguedad = 200;
        }
        
        if(cargasFamiliares == 1){
            pagoCargasFamiliares = 30;
        }else if(cargasFamiliares == 2){
            pagoCargasFamiliares = 70;
        }else if(cargasFamiliares >= 3){
            pagoCargasFamiliares = 100;
        }
        
        return (salario + pagoAntiguedad + pagoCargasFamiliares);
    }
    
    public double calcularSalario(double extra){
        return this.calcularSalario() + extra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEmpleadoAsalariado{" + "aniosAntiguedad=" + aniosAntiguedad + ", salario=" + salario + ", cargasFamiliares=" + cargasFamiliares + '}';
    }
       
    

}
