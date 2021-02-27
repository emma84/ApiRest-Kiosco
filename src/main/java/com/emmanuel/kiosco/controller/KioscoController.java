package com.emmanuel.kiosco.controller;

import com.emmanuel.kiosco.model.entity.Response.GenericResponse;
import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.model.entity.Response.ProductListResponse;
import com.emmanuel.kiosco.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kiosco")
public class KioscoController {
    final ProductoService productoService;

    Logger LOG = LoggerFactory.getLogger(KioscoController.class);

    public KioscoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/products")
    public ResponseEntity<GenericResponse> listaProductos() {
        try {
            final List<Producto> response = productoService.listaProductos();
            return ResponseEntity.ok(new ProductListResponse(response));
        } catch (Exception ex) {
            LOG.error("Error interno del sistema");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new GenericResponse(ex.getMessage()));
        }

    }
}
