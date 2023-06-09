/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.dao;

import ec.edu.ups.java.ejemplo.diez.idao.IPersonaDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class PersonaDAO implements IPersonaDAO {

    private List<Persona> listaPersonas;

    public PersonaDAO() {
        listaPersonas = new ArrayList<>();
    }        
    
    @Override
    public void create(Persona persona) {
        listaPersonas.add(persona);
    }

    @Override
    public Persona read(String cedula) {
        for(Persona persona : listaPersonas){
            if(persona.getCedula().equals(cedula))
                return persona;
        }
        return null;
    }

    @Override
    public void update(Persona persona) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona personaGuardada = listaPersonas.get(i);
            if(personaGuardada.getCedula().equals(persona.getCedula())){
                listaPersonas.set(i, persona);
                break;
            }                        
        }
    }

    @Override
    public void delete(String cedula) {
         for (int i = 0; i < listaPersonas.size(); i++) {
            Persona personaGuardada = listaPersonas.get(i);
            if(personaGuardada.getCedula().equals(cedula)){
                listaPersonas.remove(i);
                break;
            }                        
        }
    }

    @Override
    public List<Persona> list() {
        return listaPersonas;
    }
    
}
