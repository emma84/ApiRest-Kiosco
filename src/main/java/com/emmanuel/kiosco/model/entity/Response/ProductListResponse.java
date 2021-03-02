package com.emmanuel.kiosco.model.entity.Response;

import com.emmanuel.kiosco.model.entity.Producto;

import java.util.List;

public class ProductListResponse extends GenericResponse {
    private List<Producto> list;

    public ProductListResponse(List<Producto> list) {
        this.list = list;
    }

    public ProductListResponse(String errorMessage) {
        super(errorMessage);
    }

    public List<Producto> getList() {
        return list;
    }

    public void setList(List<Producto> list) {
        this.list = list;
    }
}
