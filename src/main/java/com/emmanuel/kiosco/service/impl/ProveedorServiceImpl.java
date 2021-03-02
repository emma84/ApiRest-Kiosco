package com.emmanuel.kiosco.service.impl;

import com.emmanuel.kiosco.client.ProveedorClient;
import com.emmanuel.kiosco.model.entity.Proveedor;
import com.emmanuel.kiosco.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    final ProveedorClient proveedorClient;

    @Autowired
    public ProveedorServiceImpl(ProveedorClient proveedorClient) {
        this.proveedorClient = proveedorClient;
    }

    @Override
    public List<Proveedor> listaProveedores() {
        final List<Proveedor> response = proveedorClient.listaProveedores();
        return response;
    }
}
