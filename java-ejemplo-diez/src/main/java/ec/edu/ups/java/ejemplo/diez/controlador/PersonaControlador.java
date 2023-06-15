/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.controlador;

import ec.edu.ups.java.ejemplo.diez.idao.IPersonaDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Persona;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class PersonaControlador {
    private Persona persona;
    private IPersonaDAO personaDAO;

    public PersonaControlador(IPersonaDAO personaDAO) {        
        this.personaDAO = personaDAO;
    }
    
    public void crear(Persona persona){
        this.persona = persona;
        personaDAO.create(persona);
    }
    
    public Persona buscar(String cedula){
        this.persona = personaDAO.read(cedula);
        return this.persona;
    }
                
}
