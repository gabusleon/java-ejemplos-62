/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.cinco;

import ec.edu.ups.java.ejemplo.cinco.clases.Empleado;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoAsalariado;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoPorComision;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoPorHoras;
import java.util.Date;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void main(String[] args) {
        
        EmpleadoAsalariado empleadoUno = new EmpleadoAsalariado(10, 1200, 2, 
                "0101", "Pepito", "Perez", "Gerente");
        EmpleadoPorComision empleadoDos = new EmpleadoPorComision(100000, 10, 
                300, "011", "Juanito", "Perez");
        EmpleadoPorHoras empleadoTres = new EmpleadoPorHoras(120, 10, "0303", 
                "Jaimito", "Perez", new Date(2023, 10, 20), "09999", "Calle 1", 
                "Vendedor");
        
        System.out.println("Empleado Asalariado: " + empleadoUno.toString());
        System.out.println("Salario: " + empleadoUno.calcularSalario());
        
        System.out.println("Empleado Comisión: " + empleadoDos.toString());
        System.out.println("Salario: " + empleadoDos.calcularSalario());
        
        System.out.println("Empleado Horaas: " + empleadoTres.toString());
        System.out.println("Salario: " + empleadoTres.calcularSalario());
        
        System.out.println("EmpleadoUno es igual a EmpleadoDos: " 
                + empleadoUno.equals(empleadoDos));
               
        
        Empleado empleadoX = new Empleado("010101");
        Empleado empleadoY = new Empleado("0101010");
        
        
        System.out.println("EmpleadoX es igual a EmpleadoY: " 
                + empleadoX.equals(empleadoY));
    }
}
