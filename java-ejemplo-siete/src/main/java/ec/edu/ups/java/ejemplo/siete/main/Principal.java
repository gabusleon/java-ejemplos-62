/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.siete.main;

import ec.edu.ups.java.ejemplo.siete.clases.Estudiante;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Principal {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.mostrarInformacion();
        Estudiante e2 = new Estudiante();                
        e2.mostrarInformacion();
        
        saludar();
        
        Estudiante.aumentar10();
        e2.mostrarInformacion();
    }
    
    public static void saludar(){
        System.out.println("Hola mundo!");
    }
}
