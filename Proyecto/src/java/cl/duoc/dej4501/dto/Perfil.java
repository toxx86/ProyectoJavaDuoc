
package cl.duoc.dej4501.dto;


public class Perfil {
    
    private int codigo_perfil;
    private String nombre_perfil;

    public Perfil() {
    }

    public Perfil(int codigo_perfil, String nombre_perfil) {
        this.codigo_perfil = codigo_perfil;
        this.nombre_perfil = nombre_perfil;
    }

    public int getCodigo_perfil() {
        return codigo_perfil;
    }

    public void setCodigo_perfil(int codigo_perfil) {
        this.codigo_perfil = codigo_perfil;
    }

    public String getNombre_perfil() {
        return nombre_perfil;
    }

    public void setNombre_perfil(String nombre_perfil) {
        this.nombre_perfil = nombre_perfil;
    }

    @Override
    public String toString() {
        return "Perfil{" + "codigo_perfil=" + codigo_perfil + ", nombre_perfil=" + nombre_perfil + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo_perfil;
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
        final Perfil other = (Perfil) obj;
        if (this.codigo_perfil != other.codigo_perfil) {
            return false;
        }
        return true;
    }
    
    
    
    
}
