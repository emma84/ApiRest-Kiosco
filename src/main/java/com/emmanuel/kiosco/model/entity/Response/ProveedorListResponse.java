package com.emmanuel.kiosco.model.entity.Response;

import com.emmanuel.kiosco.model.entity.Proveedor;

import java.util.List;

public class ProveedorListResponse extends GenericResponse {
    private List<Proveedor> listaProveedores;

    public ProveedorListResponse(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public ProveedorListResponse(String errorMessage) {
        super(errorMessage);
    }

    public List<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
}
