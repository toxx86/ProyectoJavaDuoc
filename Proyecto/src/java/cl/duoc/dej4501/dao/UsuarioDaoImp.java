/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dao;

import cl.duoc.dej4501.dto.Usuario;
import java.util.List;
import java.sql.*;
import java.util.Date;
import cl.duoc.dej4501.sql.Conexion;
import java.util.ArrayList;
/**
 *
 * @author CETECOM
 */
public class UsuarioDaoImp implements UsuarioDao {

    @Override
    public boolean agregar(Usuario dto) {
        String query="INSERT INTO USUARIO(login_usuario,"
                + "pass_usuario, nombre_usuario,apellido_usuario,correo_usuario,codigo_perfil_fk,fechaNacimiento_usuario) "
                + "VALUES(?,?,?,?,?,?,?)";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setString(1, dto.getLogin_usuario());
            ins.setString(2, dto.getPass_usuario());
            ins.setString(3, dto.getNombre_usuario());
            ins.setString(4, dto.getApellido_usuario());
            ins.setString(5, dto.getCorreo_usuario());
            ins.setInt(6, dto.getCodigo_perfil());
            ins.setDate(7, new java.sql.Date(dto.getFechaNacimiento_usuario().getTime()));
            
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;
    }
    

    @Override
    public boolean eliminar(Usuario usuario) {
        String query="DELETE FROM usuario WHERE id_usuario=";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){                 
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;
    }
    
    public boolean eliminarPorId(int codigo) {
        String query="DELETE FROM usuario WHERE id_usuario=?";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setInt(1, codigo);
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al borrar "+e.getMessage());
        }
        return false;
    }
    
    public boolean validarUsuario(String nombre,String password){
        String query= "SELECT * FROM usuario WHERE login_usuario =? AND pass_usuario = ?";
        try (PreparedStatement buscar=
                Conexion.getConexion().prepareStatement(query)){
            buscar.setString(1, nombre);
            buscar.setString(2, password);
            try(ResultSet rs = buscar.executeQuery()){
                return rs.next();
                
            }
            
            
        }catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return false;             
        }
    
    public int validarTipoUsuario(String nombre,String password){
        String query = "SELECT * FROM usuario WHERE login_usuario =? AND pass_usuario = ?";
         try (PreparedStatement buscar=
                Conexion.getConexion().prepareStatement(query)){
            buscar.setString(1, nombre);
            buscar.setString(2, password);
            ResultSet rs = buscar.executeQuery();
            if(rs.next()){
                return rs.getInt("codigo_perfil_fk");
                
            }
            
            
        }catch (Exception e) {
            System.out.println("Error al agregar "+e.getMessage());
        }
        return 0;             
        }
    
    public Usuario listarUsuario(String usuario) {
          Usuario dto = new Usuario();
        String query="SELECT * FROM usuario WHERE login_usuario = ?";
                
        try (PreparedStatement buscar=
                Conexion.getConexion().prepareStatement(query)){
            buscar.setString(1, usuario);
            try(ResultSet rs= buscar.executeQuery()){
                while(rs.next()){
                    dto.setId_usuario(rs.getInt("id_usuario"));
                    dto.setLogin_usuario(rs.getString("login_usuario"));
                    dto.setPass_usuario(rs.getString("pass_usuario"));
                    dto.setNombre_usuario(rs.getString("nombre_usuario"));
                    dto.setApellido_usuario(rs.getString("apellido_usuario"));
                    dto.setCorreo_usuario(rs.getString("correo_usuario"));
                    dto.setCodigo_perfil(rs.getInt("codigo_perfil_fk"));
                    dto.setFechaNacimiento_usuario(new java.sql.Date(dto.getFechaNacimiento_usuario().getTime()));
                    return dto;
                }                    
            }                   
        } catch (Exception e) {
            System.out.println("Error al listar razas "+e.getMessage());
        }
        return dto;
    }
    
    public Usuario listarUsuarioPorId(int codigo) {
          Usuario dto = new Usuario();
        String query="SELECT * FROM usuario WHERE id_usuario = ?";
                
        try (PreparedStatement buscar=
                Conexion.getConexion().prepareStatement(query)){
            buscar.setInt(1, codigo);
            try(ResultSet rs= buscar.executeQuery()){
                while(rs.next()){
                    dto.setId_usuario(rs.getInt("id_usuario"));
                    dto.setLogin_usuario(rs.getString("login_usuario"));
                    dto.setPass_usuario(rs.getString("pass_usuario"));
                    dto.setNombre_usuario(rs.getString("nombre_usuario"));
                    dto.setApellido_usuario(rs.getString("apellido_usuario"));
                    dto.setCorreo_usuario(rs.getString("correo_usuario"));
                    dto.setCodigo_perfil(rs.getInt("codigo_perfil_fk"));
                    dto.setFechaNacimiento_usuario(new java.sql.Date(dto.getFechaNacimiento_usuario().getTime()));
                    return dto;
                }                    
            }                   
        } catch (Exception e) {
            System.out.println("Error al listar razas "+e.getMessage());
        }
        return dto;
    }
    
    public ArrayList<Usuario> ListarTodosLosUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try{
            String query = "SELECT id_usuario,login_usuario,pass_usuario,nombre_usuario,apellido_usuario,correo_usuario,codigo_perfil_fk,fechaNacimiento_usuario FROM usuario";
                   
            PreparedStatement buscar=
                    Conexion.getConexion().prepareStatement(query);
            
            
            ResultSet rs= buscar.executeQuery();
            while(rs.next()){
                Usuario dto = new Usuario();
                dto.setId_usuario(rs.getInt("id_usuario"));
                    dto.setLogin_usuario(rs.getString("login_usuario"));
                    dto.setPass_usuario(rs.getString("pass_usuario"));
                    dto.setNombre_usuario(rs.getString("nombre_usuario"));
                    dto.setApellido_usuario(rs.getString("apellido_usuario"));
                    dto.setCorreo_usuario(rs.getString("correo_usuario"));
                    dto.setCodigo_perfil(rs.getInt("codigo_perfil_fk"));
                    dto.setFechaNacimiento_usuario(rs.getDate("fechaNacimiento_usuario"));
                lista.add(dto);
            }
            buscar.close();            
        }catch(SQLException w){
            System.out.println("Error SQL al listar Todos los usuarios "+w.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar todos los usuarios"+e.getMessage());
        }        
        return lista;
    }
    
     public boolean modificarUsuario(int codigo,Usuario dto){
        String query="UPDATE usuario SET login_usuario=?,pass_usuario=?,nombre_usuario=?,apellido_usuario=?,correo_usuario=?,codigo_perfil_fk=?,fechaNacimiento_usuario=? WHERE id_usuario=?";
        try (PreparedStatement ins=
                Conexion.getConexion().prepareStatement(query)){
            ins.setString(1, dto.getLogin_usuario());
            ins.setString(2, dto.getPass_usuario());
            ins.setString(3, dto.getNombre_usuario());
            ins.setString(4, dto.getApellido_usuario());
            ins.setString(5, dto.getCorreo_usuario());
            ins.setInt(6, dto.getCodigo_perfil());
            ins.setDate(7, new java.sql.Date(dto.getFechaNacimiento_usuario().getTime()));
            ins.setInt(8, codigo);
            if(ins.executeUpdate()>0)
                return true;
        } catch (Exception e) {
            System.out.println("Error al modificar usuario "+e.getMessage());
        }
        return false;
    }
    
    
    
}
