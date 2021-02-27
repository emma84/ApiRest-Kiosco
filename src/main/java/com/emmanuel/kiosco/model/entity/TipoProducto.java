package com.emmanuel.kiosco.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_productos")
public class TipoProducto {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tprod_id")
    private int idTipoProducto;
    @Column(name = "tprod_descripcion")
    private String descripcion;

    public TipoProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoProducto() {
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
