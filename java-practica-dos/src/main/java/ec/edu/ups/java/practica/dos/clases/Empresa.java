/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.dos.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabus
 */
public class Empresa {
    private String ruc;
    private String razonSocial;
    //atributo de relación de composición
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public Empresa(String ruc, String razonSocial) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;        
        this.empleados = new ArrayList<>();
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
            
    public void agregarEmpleado(double sueldo, String cedula, String nombre, 
            String direccion, String correoElectronico){
        
        Empleado empleado = new Empleado(sueldo, cedula, nombre, direccion, 
                correoElectronico);
        this.empleados.add(empleado);
    }
    
    public void agregarDirectivo(String categoria, double sueldo, String cedula, 
            String nombre, String direccion, String correoElectronico){
        
        Directivo directivo = new Directivo(categoria, sueldo, cedula, nombre, direccion, correoElectronico);
        this.empleados.add(directivo);
    }
    
    public void agregarSubordinadoDirectivo(String cedulaSubordinado, String cedulaDirectivo){
        //encontrar empleado subordinado
        Empleado subordinado = new Empleado();
        Directivo directivo = new Directivo();
        
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if(empleado.getCedula().equals(cedulaSubordinado)){
                subordinado = empleado;
                break;
            }            
        }
        
        if(subordinado != null){
            for (int i = 0; i < empleados.size(); i++) {
                Empleado empleado = empleados.get(i);
                if(empleado.getCedula().equals(cedulaDirectivo)){
                    if(empleado instanceof Directivo){
                        directivo = (Directivo) empleado;
                        directivo.agregarSubordinado(subordinado);
                        break;
                    }                    
                }            
            }
        }
        
    }

    @Override
    public String toString() {
        return "Empresa{" + "ruc=" + ruc + ", razonSocial=" + razonSocial + 
                ", empleados=" + empleados + '}';
    }
            
}
