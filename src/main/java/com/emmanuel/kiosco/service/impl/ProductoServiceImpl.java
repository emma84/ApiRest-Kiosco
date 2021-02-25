package com.emmanuel.kiosco.service.impl;

import com.emmanuel.kiosco.mapper.ProductoMapper;
import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService {
    final ProductoMapper productoMapper;
    Logger LOG = LoggerFactory.getLogger(ProductoServiceImpl.class);

    public ProductoServiceImpl(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    @Override
    public Producto agregarProducto(Producto p) {
        try {
            final Producto producto = new Producto();
            producto.setDescripcion(p.getDescripcion());
            producto.setPrecioVenta(p.getPrecioVenta());
            producto.setFechaVencimiento(p.getFechaVencimiento());
            producto.setTipoProducto(p.getTipoProducto());
            return productoMapper.agregarProducto(producto);
        } catch (Exception ex) {
            return null;
        }
    }
}
