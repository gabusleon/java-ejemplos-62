package ec.edu.ups.java.ejemplo.cinco.interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface IMarcacionEmpleado {
    
    public static final int MINUTOS_DE_ATRASO_PERMITIDOS = 8;
    
    public abstract void registrarEntrada();
    public abstract void registrarSalida();
    int visualizarAtrasos();
    
}
