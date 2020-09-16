/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;

import cl.duoc.dej4501.dto.Producto;
import cl.duoc.dej4501.sql.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author CETECOM
 */
public class ProductoDaoImp implements ProductoDao {

    @Override
    public List<String> listarProducto() {
          List<String> lista = new ArrayList<>();
        String query="SELECT nombre_producto FROM producto ORDER BY "
                + "nombre_producto ASC";
        try (PreparedStatement buscar=
                Conexion.getConexion().prepareStatement(query)){
            try(ResultSet rs= buscar.executeQuery()){
                while(rs.next()){
                    lista.add(rs.getString("nombre_producto"));
                }                    
            }                   
        } catch (Exception e) {
            System.out.println("Error al listar razas "+e.getMessage());
        }
        return lista;
    }
    
    public int nombreProductoAId(String nombreProducto){
        try {
            String query = "SELECT codigo_producto FROM producto WHERE nombre_producto=?";
            PreparedStatement buscar
                    = Conexion.getConexion().prepareStatement(query);
            buscar.setString(1, nombreProducto);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                return rs.getInt("codigo_producto");
            }
        } catch (SQLException w) {
            System.out.println("Error SQL en nombreProductoAid " + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error en nombreProductoAid " + e.getMessage());
        }
        return 0;
    }
    
     public String idANombreProducto(int codigo){
        try {
            String query = "SELECT nombre_producto FROM producto WHERE codigo_producto=?";
            PreparedStatement buscar
                    = Conexion.getConexion().prepareStatement(query);
            buscar.setInt(1, codigo);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                return rs.getString("nombre_producto");
            }
        } catch (SQLException w) {
            System.out.println("Error SQL en codigo a nombre producto " + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error en codigo a nombre producto " + e.getMessage());
        }
        return "";
    }
    
    public int ListarPrecio(String nombre){
        try {
            String query = "SELECT precio_producto from producto where "
                    + " nombre_producto=?";
            PreparedStatement buscar
                    = Conexion.getConexion().prepareStatement(query);
            buscar.setString(1, nombre);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                return rs.getInt("precio_producto");
            }
        } catch (SQLException w) {
            System.out.println("Error SQL en marcaToId " + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error en marcaToID " + e.getMessage());
        }
        return 0;
    }
    
    
    
    

    @Override
    public boolean agregar(Producto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Producto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
