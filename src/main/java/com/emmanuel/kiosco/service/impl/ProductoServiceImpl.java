package com.emmanuel.kiosco.service.impl;

import com.emmanuel.kiosco.mapper.ProductoMapper;
import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    final ProductoMapper productoMapper;
    Logger LOG = LoggerFactory.getLogger(ProductoServiceImpl.class);

    public ProductoServiceImpl(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    @Override
    public List<Producto> listaProductos() throws IllegalArgumentException {
        final List<Producto> response = productoMapper.listaProductos();
        if (response.size() == 0) {
            throw new IllegalArgumentException();
        }
        return response;
    }
}
