/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.dej4501.dto;

/**
 *
 * @author CETECOM
 */
public class Producto {
    private int codigo_producto;
    private String nombre_producto;
    private int codigo_tipo;
    private int precio_producto;

    public Producto() {
    }

    public Producto(int codigo_producto, String nombre_producto, int codigo_tipo, int precio_producto) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.codigo_tipo = codigo_tipo;
        this.precio_producto = precio_producto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCodigo_tipo() {
        return codigo_tipo;
    }

    public void setCodigo_tipo(int codigo_tipo) {
        this.codigo_tipo = codigo_tipo;
    }

    public int getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(int precio_producto) {
        this.precio_producto = precio_producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto + ", codigo_tipo=" + codigo_tipo + ", precio_producto=" + precio_producto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigo_producto;
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
        final Producto other = (Producto) obj;
        if (this.codigo_producto != other.codigo_producto) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
