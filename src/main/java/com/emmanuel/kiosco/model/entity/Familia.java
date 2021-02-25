package com.emmanuel.kiosco.model.entity;

import javax.persistence.*;


@Entity
@Table(name = "familia_productos")
public class Familia {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fam_id")
    private int idFamilia;
    @Column(name = "fam_nombre")
    private String nombre;

    public Familia(String nombre) {
        this.nombre = nombre;
    }

    public Familia() {
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
