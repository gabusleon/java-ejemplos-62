/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.uno.main;

import ec.edu.ups.java.ejemplo.uno.clases.OperadoraTelefonica;
import ec.edu.ups.java.ejemplo.uno.clases.Persona;
import ec.edu.ups.java.ejemplo.uno.clases.Telefono;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author Gabus
 */
public class Principal {        
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
                
        //ingresar información por teclado de Persona 
        System.out.print("Ingresa la cedula de la persona: ");
        String cedula = entrada.next();
        System.out.print("Ingresa el nombre de la persona: ");
        String nombre = entrada.next();
        System.out.print("Ingresa el día de la fecha de nacimiento de la persona: ");
        int dia = entrada.nextInt();
        System.out.print("Ingresa el mes de la fecha de nacimiento de la persona: ");
        int mes = entrada.nextInt();
        System.out.print("Ingresa el año de la fecha de nacimiento de la persona: ");
        int anio = entrada.nextInt();
        
        //intanciar un objeto tipo Date con la fecha de nacimiento de la persona
        Date fechaNacimiento = new Date(anio-1900, mes-1, dia);
        
        //instanciar un nuevo objeto tipo Persona
        Persona persona = new Persona();
        persona.setCedula(cedula);
        persona.setNombre(nombre);
        persona.setFechaNacimiento(fechaNacimiento);
        //imprimir objeto
        System.out.println("Datos de persona: " + persona.toString());
        
        //ingresar información por teclado de OperadoraTelefonica
        System.out.print("Ingrese el codigo de la Operadora Telefónica: ");
        int codigo = entrada.nextInt();
        System.out.print("Ingrese el nombre de la Operadora Telefónica: ");
        String nombreOperadora = entrada.next();
        
        //instanciar un nuevo objeto de tipo OperadoraTelefonica
        OperadoraTelefonica operadora = new OperadoraTelefonica();
        operadora.setCodigo(codigo);
        operadora.setNombre(nombreOperadora);
        
        //imprimir objeto
        System.out.println("Datos de la Operadora Telefonica: " + operadora.toString());
        
        //Ingresar información por teclado del Telefono
        System.out.print("Ingrese el numero de Teléfono: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese el tipo de Teléfono: ");
        String tipo = entrada.next();
        
        //Instanciar objeto Telefono
        Telefono telefono = new Telefono();
        telefono.setNumero(numero);
        telefono.setTipo(tipo);
        //asignar los objetos creados a partir de las relaciones
        telefono.setUnaPersona(persona);
        telefono.setUnaOperadora(operadora);
        
        //imprimir información de Telefono
        System.out.println("Numero de telefono: " + telefono.getNumero());
        System.out.println("Tipo de telefono: " + telefono.getTipo());
        System.out.println("Nombre de la persona asignada al Telefono: " + telefono.getUnaPersona().getNombre());
        System.out.println("Nombre de la Operadora asignada al Telefono: " + telefono.getUnaOperadora().getNombre());
        
        
        
    }
}
