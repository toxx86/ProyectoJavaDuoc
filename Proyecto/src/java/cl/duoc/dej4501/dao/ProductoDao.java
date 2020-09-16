/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;

import cl.duoc.dej4501.dto.Producto;
import java.util.List;

/**
 *
 * @author CETECOM
 */
public interface ProductoDao extends BaseDao<Producto> {
    
    public List<String> listarProducto();
    
}
