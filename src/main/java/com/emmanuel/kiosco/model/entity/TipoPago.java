package com.emmanuel.kiosco.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipo_pagos")
public class TipoPago {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tpago_id")
    private int idPago;
    @Column(name = "tpago_descripcion")
    private String descripcion;

    public TipoPago(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoPago() {
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
