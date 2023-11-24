/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.java.ejemplo.cinco;

import ec.edu.ups.java.ejemplo.cinco.clases.Empleado;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoAsalariado;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoPorComision;
import ec.edu.ups.java.ejemplo.cinco.clases.EmpleadoPorHoras;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void ingresarDatos(){
        
    }
    public static void main(String[] args) {
        
        ingresarDatos();
        
        int numero1 =  Integer.parseInt("100");
        String caadena1 = String.valueOf(101);
        
        List<Empleado> empleados = new ArrayList<>();
        Empleado empleadoUno = new EmpleadoAsalariado(6, 800, 2, "0101", "Pepito", "Perez", "Jefe");        
        empleadoUno.aumentarNumeroDeEmpleados();
        Empleado empleadoDos = new EmpleadoPorComision(10000, 10, 400, "010202", "Juanito", "Perez");
        empleadoDos.aumentarNumeroDeEmpleados();
        Empleado empleadoTres = new EmpleadoPorHoras(160, 4, "030303", "Maria", "Perez", new Date(1999, 2, 30), "09999999", "Calle", "Secretaria");
        empleadoTres.aumentarNumeroDeEmpleados();
        
        //Empleado.numeroDeEmpleados = 10;
        System.out.println("Numero de empleados: " + Empleado.numeroDeEmpleados);
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Cual es el valor de la multa si llego tarde 5 horas? " + Empleado.calcularMulta(5));
        System.out.println("El número 5 es mayor a 2? " + Math.max(5, 2));

        empleados.add(empleadoUno);
        empleados.add(empleadoDos);
        empleados.add(empleadoTres);

        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
            System.out.println(empleado.calcularSalario());
            if (empleado instanceof EmpleadoPorHoras) {
                EmpleadoPorHoras miEmpleado = (EmpleadoPorHoras) empleado;
                System.out.println("Horas trabajadas: " + miEmpleado.getNumeroDeHorasTrabajadas());
                
            } else if (empleado instanceof EmpleadoAsalariado) {
                EmpleadoAsalariado miEmpleado = (EmpleadoAsalariado) empleado;
                System.out.println("Años de antiguedad: " + miEmpleado.getAniosAntiguedad());
                miEmpleado.registrarEntrada();
                miEmpleado.registrarSalida();
                miEmpleado.visualizarAtrasos();
            } else if (empleado instanceof EmpleadoPorComision) {
                EmpleadoPorComision miEmpleado = (EmpleadoPorComision) empleado;
                System.out.println("Total de ventas: " + miEmpleado.getTotalDeVentas());
                miEmpleado.registrarEntrada();
                miEmpleado.registrarSalida();
                miEmpleado.visualizarAtrasos();
            }
        }
    }
}
