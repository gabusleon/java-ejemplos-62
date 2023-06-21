/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.controlador;

import ec.edu.ups.java.ejemplo.diez.idao.ITelefonoDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Telefono;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class TelefonoControlador {
    private Telefono telefono;
    private ITelefonoDAO telefonoDAO;

    public TelefonoControlador(ITelefonoDAO telefonoDAO) {        
        this.telefonoDAO = telefonoDAO;
    }
    
    public void crear(Telefono telefono){
        this.telefono = telefono;
        telefonoDAO.create(telefono);
    }
    
    public Telefono buscar(String numero){
        this.telefono = telefonoDAO.read(numero);
        return this.telefono;
    }
    
    public boolean actualizar(Telefono telefono){
        Telefono telefonoEncontrado = this.buscar(telefono.getNumero());
        if(telefonoEncontrado != null){
            telefonoDAO.update(telefono);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String numero){
        Telefono telefonoEncontrado = this.buscar(telefono.getNumero());
        if(telefonoEncontrado != null){
            telefonoDAO.delete(numero);
            return true;
        }
        return false;
    }
    
    public List<Telefono> listar(){
        return telefonoDAO.list();
    }
                
}
