/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.idao;

import ec.edu.ups.java.ejemplo.diez.modelo.Persona;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface IPersonaDAO {
    
    public void create(Persona persona);
    public Persona read(String cedula);
    public void update(Persona persona);
    public void delete(String cedula);
    public List<Persona> list();
    
}
