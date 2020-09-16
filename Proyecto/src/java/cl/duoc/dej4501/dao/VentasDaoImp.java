/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;


import cl.duoc.dej4501.dto.Usuario;
import cl.duoc.dej4501.dto.Ventas;
import cl.duoc.dej4501.sql.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author CETECOM
 */
public class VentasDaoImp implements VentasDao {

    @Override
    public boolean agregar(Ventas dto) {
        String query="INSERT INTO Ventas(codigo_venta,"
                + "codigo_vendedor, fecha_venta,total_venta) "
                + "VALUES(?,?,now(),?)";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setInt(1, dto.getCodigo_venta());
            ins.setInt(2, dto.getCodigo_vendedor());
            ins.setInt(3,dto.getTotal_venta());
            
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;
    }
    
    public int SiguienteVenta(){
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
    
    public int totalVenta(){
        try {
            String query = "SELECT SUM(total) FROM detalle_ventas WHERE codigo_venta_fk = ?";
            PreparedStatement buscar
                    = Conexion.getConexion().prepareStatement(query);
            buscar.setInt(1, SiguienteVenta());
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                return rs.getInt("SUM(total)");
            }
        } catch (SQLException w) {
            System.out.println("Error SQL en totalVenta" + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error en totalVenta " + e.getMessage());
        }
        return 0;
    }
    
    
    public boolean actualizarVenta(){
        String query="UPDATE ventas SET total_venta=? WHERE codigo_venta = ?";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setInt(1, totalVenta());
            ins.setInt(2, SiguienteVenta());
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al Actualizar "+e.getMessage());
        }
        return false;
    }
    
    public int codigoVendedorConMasVentas() {
        
        try{
            String query = "SELECT       `codigo_vendedor`,\n" +
"             COUNT(`codigo_vendedor`) AS `value_occurrence` \n" +
"    FROM     `ventas`\n" +
"    GROUP BY `codigo_vendedor`\n" +
"    ORDER BY `value_occurrence` DESC\n" +
"    LIMIT    1";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                return rs.getInt("codigo_vendedor");
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar codigo vendedor con mas ventas "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar codigo vendedor con mas ventas "+e.getMessage());
        }        
        return 0;
    }
    
     public ArrayList<Usuario> ListarVendedorConMasVentas(int codigo) {
        ArrayList<Usuario> lista = new ArrayList<>();
        try{
            String query = "SELECT * FROM usuario WHERE id_usuario=? ";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            buscar.setInt(1, codigo);
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                Usuario dto = new Usuario();
                dto.setId_usuario(rs.getInt("id_usuario"));
                dto.setLogin_usuario("");
                dto.setPass_usuario("");
                dto.setNombre_usuario(rs.getString("nombre_usuario"));
                dto.setApellido_usuario(rs.getString("apellido_usuario"));
                dto.setCorreo_usuario(rs.getString("correo_usuario"));
                dto.setCodigo_perfil(0);
                dto.setFechaNacimiento_usuario(rs.getDate("fechaNacimiento_usuario"));
                lista.add(dto);
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar vendedor con mas ventas "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar vendedor con mas ventas "+e.getMessage());
        }        
        return lista;
    }
    
    
    


    

    @Override
    public boolean eliminar(Ventas dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
