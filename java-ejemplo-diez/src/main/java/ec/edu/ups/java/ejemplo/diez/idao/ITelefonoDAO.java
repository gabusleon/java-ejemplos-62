/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.idao;

import ec.edu.ups.java.ejemplo.diez.modelo.Telefono;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface ITelefonoDAO {
    
    public void create(Telefono persona);
    public Telefono read(String numero);
    public void update(Telefono persona);
    public void delete(String numero);
    public List<Telefono> list();
    
}
