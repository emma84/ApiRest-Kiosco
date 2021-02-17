package com.emmanuel.kiosco.mapper;

import com.emmanuel.kiosco.model.entity.Producto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductoMapper{
     Producto agregarProducto(Producto p);
}
