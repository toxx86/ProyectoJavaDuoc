/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;

/**
 *
 * @author CETECOM
 */
public interface BaseDao<T> {
    public boolean agregar(T dto);
    
    public boolean eliminar(T dto);
    
}
