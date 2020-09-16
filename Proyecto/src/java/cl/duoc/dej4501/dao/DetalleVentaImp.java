/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;

import cl.duoc.dej4501.dto.Detalle_Venta;
import cl.duoc.dej4501.dto.Producto;
import cl.duoc.dej4501.sql.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Toragin
 */
public class DetalleVentaImp implements DetalleVentaDao {  
  
    @Override
    public boolean agregar(Detalle_Venta dto) {
       String query="INSERT INTO detalle_ventas(codigo_producto_fk,"
                +"cantidad,total,codigo_venta_fk) "
                + "VALUES(?,?,?,?)";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setInt(1, dto.getCodigo_producto());
            ins.setInt(2, dto.getCantidad());
            ins.setInt(3, dto.getTotal());
            ins.setInt(4, dto.getCodigo_venta());
            
            
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;
    }
    
    public ArrayList<Detalle_Venta> listarVentas(int codigo) {
        ArrayList<Detalle_Venta> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM detalle_ventas WHERE codigo_venta_fk=? ";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            buscar.setInt(1, codigo);
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                Detalle_Venta dto = new Detalle_Venta();
                dto.setCodigo_producto(rs.getInt("codigo_producto_fk"));
                dto.setCantidad(rs.getInt("cantidad"));
                dto.setTotal(rs.getInt("total"));
                dto.setCodigo_venta(rs.getInt("codigo_venta_fk"));
                
                lista.add(dto);
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar ventas "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar ventas "+e.getMessage());
        }        
        return lista;
    }
    
    public int UltimaVenta(){
       try {
            String query = "select codigo_venta from ventas ORDER BY codigo_venta DESC LIMIT 1; ";
            PreparedStatement buscar
                    = Conexion.getConexion().prepareStatement(query);
           
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                return rs.getInt("codigo_venta");
            }
        } catch (SQLException w) {
            System.out.println("Error SQL en marcaToId " + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error en marcaToID " + e.getMessage());
        }
        return 0;
    }
    
    public int codigoProductoMasVendido() {
        
        try{
            String query = "SELECT       `codigo_producto_fk`,\n" +
"             COUNT(`codigo_producto_fk`) AS `value_occurrence` \n" +
"    FROM     `detalle_ventas`\n" +
"    GROUP BY `codigo_producto_fk`\n" +
"    ORDER BY `value_occurrence` DESC\n" +
"    LIMIT    1";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                return rs.getInt("codigo_producto_fk");
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar ventas "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar ventas "+e.getMessage());
        }        
        return 0;
    }
    
    
    public ArrayList<Producto> listarProductoMasVendido(int codigo) {
        ArrayList<Producto> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM producto WHERE codigo_producto=? ";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            buscar.setInt(1, codigo);
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                Producto dto = new Producto();
                dto.setCodigo_producto(rs.getInt("codigo_producto"));
                dto.setNombre_producto(rs.getString("nombre_producto"));
                dto.setCodigo_tipo(rs.getInt("codigo_tipo_fk"));
                dto.setPrecio_producto(rs.getInt("precio_producto"));           
                lista.add(dto);
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar ventas "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar ventas "+e.getMessage());
        }        
        return lista;
    }
    
    
    

    @Override
    public boolean eliminar(Detalle_Venta dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
