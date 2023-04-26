/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.java.ejemplo.cuatro.main;

import ec.edu.ups.java.ejemplo.cuatro.clases.Cliente;

/**
 *
 * @author Gabus
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("frecuente");
        cliente.setCodigo(1);
        cliente.setDireccion("callecita uno");
        cliente.setNombreYApellido("Pepito Perez");
        
        System.out.println(cliente);
        
        Cliente clienteDos = new Cliente("VIP", 2, "Juanito Perez", "Otra calle");
        System.out.println(clienteDos);
    }
}
