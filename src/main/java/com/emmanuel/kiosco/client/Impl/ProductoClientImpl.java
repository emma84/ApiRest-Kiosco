package com.emmanuel.kiosco.client.Impl;

import com.emmanuel.kiosco.client.ProductoClient;
import com.emmanuel.kiosco.mapper.ProductoMapper;
import com.emmanuel.kiosco.model.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoClientImpl implements ProductoClient {
    final ProductoMapper productoMapper;

    @Autowired
    public ProductoClientImpl(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    @Override
    public List<Producto> listaProductos() {
        final List<Producto> response = productoMapper.listaProductos();
        return response;
    }
}
