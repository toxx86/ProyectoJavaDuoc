
package cl.duoc.dej4501.dto;
import java.util.Date;

public class Ventas {
    
    private int codigo_venta;
    private int codigo_vendedor;
    private Date fecha_venta;
    private int total_venta;

    public Ventas() {
    }

    public Ventas(int codigo_venta, int codigo_vendedor, Date fecha_venta, int total_venta) {
        this.codigo_venta = codigo_venta;
        this.codigo_vendedor = codigo_vendedor;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public int getCodigo_vendedor() {
        return codigo_vendedor;
    }

    public void setCodigo_vendedor(int codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(int total_venta) {
        this.total_venta = total_venta;
    }

    @Override
    public String toString() {
        return "Ventas{" + "codigo_venta=" + codigo_venta + ", codigo_vendedor=" + codigo_vendedor + ", fecha_venta=" + fecha_venta + ", total_venta=" + total_venta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigo_venta;
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
        final Ventas other = (Ventas) obj;
        if (this.codigo_venta != other.codigo_venta) {
            return false;
        }
        return true;
    }
    
    
    
}
