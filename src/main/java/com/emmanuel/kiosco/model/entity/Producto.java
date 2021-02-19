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
    @Column(name = "prod_id_familia")
    private Familia familia;
    private List<Proveedor> listaProveedores;
    private List<Familia> listaFamilias;

    public Producto(String errorMessage, String descripcion, float precioVenta, Date fechaVencimiento, int tipoProducto,
                    Familia familia, List<Proveedor> listaProveedores, List<Familia> listaFamilias) {
        super(errorMessage);
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoProducto = tipoProducto;
        this.familia = familia;
        this.listaProveedores = listaProveedores;
        this.listaFamilias = listaFamilias;
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

    public List<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public List<Familia> getListaFamilias() {
        return listaFamilias;
    }

    public void setListaFamilias(List<Familia> listaFamilias) {
        this.listaFamilias = listaFamilias;
    }
}
