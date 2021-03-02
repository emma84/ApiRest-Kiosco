package com.emmanuel.kiosco.service.impl;

import com.emmanuel.kiosco.client.ProductoClient;
import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    final ProductoClient productoClient;
    Logger LOG = LoggerFactory.getLogger(ProductoServiceImpl.class);

    @Autowired
    public ProductoServiceImpl(ProductoClient productoClient) {
        this.productoClient = productoClient;
    }


    @Override
    public List<Producto> listaProductos() throws IllegalArgumentException {
        final List<Producto> response = productoClient.listaProductos();
        if (response.size() == 0) {
            throw new IllegalArgumentException();
        }
        return response;
    }
}
