/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.siete.clases;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class Estudiante {
    
    private int a;
    private static int b;

    public Estudiante() {
        b++;
        a++;
    }
    
    public void mostrarInformacion(){
        System.out.println("Variable a: " + a);
        System.out.println("Variable estática b: " + b);
        System.out.println("");
    }
    
    public static void aumentar10(){
        b+=10;
    }
    
}
