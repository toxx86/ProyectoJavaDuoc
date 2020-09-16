
package cl.duoc.dej4501.dto;


public class Detalle_Venta {
    
    private int codigo_producto;
    private int cantidad;
    private int total;
    private int codigo_venta;

    public Detalle_Venta() {
    }

    public Detalle_Venta(int codigo_producto, int cantidad, int total, int codigo_venta) {
        this.codigo_producto = codigo_producto;
        this.cantidad = cantidad;
        this.total = total;
        this.codigo_venta = codigo_venta;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCodigo_venta() {
        return codigo_venta;
    }

    public void setCodigo_venta(int codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    @Override
    public String toString() {
        return "Detalle_Venta{" + "codigo_producto=" + codigo_producto + ", cantidad=" + cantidad + ", total=" + total + ", codigo_venta=" + codigo_venta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.codigo_venta;
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
        final Detalle_Venta other = (Detalle_Venta) obj;
        if (this.codigo_venta != other.codigo_venta) {
            return false;
        }
        return true;
    }
    
    
    
    
}
