package com.emmanuel.kiosco.mapper;

import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.model.entity.Proveedor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductoMapper {
    List<Producto> listaProductos();

    List<Proveedor> listaProveedores();
}
