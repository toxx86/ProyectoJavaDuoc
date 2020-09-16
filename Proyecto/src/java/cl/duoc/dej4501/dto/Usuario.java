
package cl.duoc.dej4501.dto;
import java.util.Date;

public class Usuario {
    
    private int id_usuario;
    private String login_usuario;
    private String pass_usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String correo_usuario;
    private int codigo_perfil;
    private Date fechaNacimiento_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String login_usuario, String pass_usuario, String nombre_usuario, String apellido_usuario, String correo_usuario, int codigo_perfil, Date fechaNacimiento_usuario) {
        this.id_usuario = id_usuario;
        this.login_usuario = login_usuario;
        this.pass_usuario = pass_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.codigo_perfil = codigo_perfil;
        this.fechaNacimiento_usuario = fechaNacimiento_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getLogin_usuario() {
        return login_usuario;
    }

    public void setLogin_usuario(String login_usuario) {
        this.login_usuario = login_usuario;
    }

    public String getPass_usuario() {
        return pass_usuario;
    }

    public void setPass_usuario(String pass_usuario) {
        this.pass_usuario = pass_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public int getCodigo_perfil() {
        return codigo_perfil;
    }

    public void setCodigo_perfil(int codigo_perfil) {
        this.codigo_perfil = codigo_perfil;
    }

    public Date getFechaNacimiento_usuario() {
        return fechaNacimiento_usuario;
    }

    public void setFechaNacimiento_usuario(Date fechaNacimiento_usuario) {
        this.fechaNacimiento_usuario = fechaNacimiento_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", login_usuario=" + login_usuario + ", pass_usuario=" + pass_usuario + ", nombre_usuario=" + nombre_usuario + ", apellido_usuario=" + apellido_usuario + ", correo_usuario=" + correo_usuario + ", codigo_perfil=" + codigo_perfil + ", fechaNacimiento_usuario=" + fechaNacimiento_usuario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_usuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id_usuario != other.id_usuario) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
