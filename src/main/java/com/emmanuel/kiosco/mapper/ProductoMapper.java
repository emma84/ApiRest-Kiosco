package com.emmanuel.kiosco.mapper;

import com.emmanuel.kiosco.model.entity.Producto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductoMapper{
     List<Producto> listaProductos();
}
