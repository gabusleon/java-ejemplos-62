/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.practica.dos.main;

import ec.edu.ups.java.practica.dos.clases.Cliente;
import ec.edu.ups.java.practica.dos.clases.Empresa;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("0999887766", "01010101", "Pepito", "Calle Vieja", "pepito@ups.edu.ec");
        
        Empresa empresaUno = new Empresa("0102030405001", "Salesianos Inn.");
        
        empresaUno.agregarEmpleado(1000.43, "abc001", "empleado 1", "direccion 1", "correo1@empresa1.com");
        empresaUno.agregarEmpleado(600.89, "abc002", "empleado 2", "direccion 2", "correo2@empresa1.com");
        empresaUno.agregarEmpleado(870.98, "abc003", "empleado 3", "direccion 3", "correo3@empresa1.com");
        
        empresaUno.agregarDirectivo("gerente", 3500.89, "dir001", "directivo 1", "direccion 1", "directivo1@empresa1.com");        
        empresaUno.agregarDirectivo("jefe departamento ventas", 1500.89, "dir002", "directivo 2", "direccion 2", "directivo2@empresa.com1");
        
        empresaUno.agregarSubordinadoDirectivo("abc001", "dir001");
        
        System.out.println("Datos de la empresa: \n" +  empresaUno.toString());
        
     
    }
}
