package com.emmanuel.kiosco.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto extends GenericResponse {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_codigo")
    private int codProducto;
    @Column(name = "prod_descripcion")
    private String descripcion;
    @Column(name = "prod_precio_venta")
    private float precioVenta;
    @Column(name = "prod_fecha_vencimiento")
    private Date fechaVencimiento;
    @Column(name = "prod_tipo_producto")
    private int tipoProducto;
    @ManyToOne
    @JoinColumn(name = "prod_id_familia")
    private Familia familia;
    @ManyToOne
    @JoinColumn(name = "prod_id_proveedor")
    private Proveedor proveedor;


    public Producto(String descripcion, float precioVenta, Date fechaVencimiento, int tipoProducto, Familia familia, Proveedor proveedor) {
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoProducto = tipoProducto;
        this.familia = familia;
        this.proveedor = proveedor;
    }

    public Producto() {

    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(int tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
