/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.ocho.controlador;

import ec.edu.ups.java.ejemplo.ocho.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class ControladorPersona implements IControlador {

    private List<Persona> personas;

    public ControladorPersona() {
        personas = new ArrayList<>();
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
    }

    @Override
    public Object read(Object obj) {
        if(obj instanceof String){
            String cedula = (String) obj;
            for (Persona persona : personas) {
                if (persona.getCedula().equals(cedula)) {
                    return persona;
                }
            }
        }

        return null;
    }

    @Override
    public void update(Object obj) {

        if (obj instanceof Persona) {

            String cedula = ((Persona) obj).getCedula();
            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.getCedula().equals(cedula)) {
                    personas.set(i, (Persona) obj);
                    break;
                }
            }

        }

    }

    @Override
    public void delete(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < personas.size(); i++) {
                Persona persona = personas.get(i);
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                    break;
                }
            }

        }
    }

    @Override
    public void list() {
        for(Persona persona : personas){
            //personas.stream().forEach(p -> System.out.println(p));
            System.out.println(persona.toString());
        }
    }
    
}
