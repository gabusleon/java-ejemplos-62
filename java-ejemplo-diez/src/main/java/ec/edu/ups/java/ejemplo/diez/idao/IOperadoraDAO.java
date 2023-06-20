/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.idao;

import ec.edu.ups.java.ejemplo.diez.modelo.Operadora;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface IOperadoraDAO {
    
    public void create(Operadora operadora);
    public Operadora read(int codigo);
    public void update(Operadora operadora);
    public void delete(int codigo);
    public List<Operadora> list();
    
}
