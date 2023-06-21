/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.dao;

import ec.edu.ups.java.ejemplo.diez.idao.ITelefonoDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Telefono;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class TelefonoDAO implements ITelefonoDAO {

    private List<Telefono> listaTelefonos;

    public TelefonoDAO() {
        listaTelefonos = new ArrayList<>();
    }        
    
    @Override
    public void create(Telefono telefono) {
        listaTelefonos.add(telefono);
    }

    @Override
    public Telefono read(String numero) {
        for(Telefono telefono : listaTelefonos){
            if(telefono.getNumero().equals(numero))
                return telefono;
        }
        return null;
    }

    @Override
    public void update(Telefono telefono) {
        for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono telefonoGuardado = listaTelefonos.get(i);
            if(telefonoGuardado.getNumero().equals(telefono.getNumero())){
                listaTelefonos.set(i, telefono);
                break;
            }                        
        }
    }

    @Override
    public void delete(String numero) {
         for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono telefonoGuardado = listaTelefonos.get(i);
            if(telefonoGuardado.getNumero().equals(numero)){
                listaTelefonos.remove(i);
                break;
            }                        
        }
    }

    @Override
    public List<Telefono> list() {
        return listaTelefonos;
    }
    
}
