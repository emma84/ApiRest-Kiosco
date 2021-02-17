package com.emmanuel.kiosco.model.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "familia_productos")
public class Familia {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "f_id_familia_producto")
    private int idFamilia;
    private String nombre;
    @OneToMany(mappedBy = "productos", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;

    public Familia(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
