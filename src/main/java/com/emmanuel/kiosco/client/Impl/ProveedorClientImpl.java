package com.emmanuel.kiosco.client.Impl;

import com.emmanuel.kiosco.client.ProveedorClient;
import com.emmanuel.kiosco.mapper.ProductoMapper;
import com.emmanuel.kiosco.model.entity.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProveedorClientImpl implements ProveedorClient {

    final ProductoMapper productoMapper;

    @Autowired
    public ProveedorClientImpl(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    @Override
    public List<Proveedor> listaProveedores() {
        List<Proveedor> response = productoMapper.listaProveedores();
        return response;
    }
}
