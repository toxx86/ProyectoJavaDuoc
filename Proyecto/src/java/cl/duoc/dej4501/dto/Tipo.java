
package cl.duoc.dej4501.dto;


public class Tipo {
    
    private int codigo_tipo;
    private String nombre_tipo;

    public Tipo() {
    }

    public Tipo(int codigo_tipo, String nombre_tipo) {
        this.codigo_tipo = codigo_tipo;
        this.nombre_tipo = nombre_tipo;
    }

    public int getCodigo_tipo() {
        return codigo_tipo;
    }

    public void setCodigo_tipo(int codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }

    @Override
    public String toString() {
        return "Tipo{" + "codigo_tipo=" + codigo_tipo + ", nombre_tipo=" + nombre_tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.codigo_tipo;
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
        final Tipo other = (Tipo) obj;
        if (this.codigo_tipo != other.codigo_tipo) {
            return false;
        }
        return true;
    }
    
    
    
    
}
