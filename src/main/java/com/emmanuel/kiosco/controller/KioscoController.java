package com.emmanuel.kiosco.controller;

import com.emmanuel.kiosco.model.entity.GenericResponse;
import com.emmanuel.kiosco.model.entity.Producto;
import com.emmanuel.kiosco.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kiosco")
public class KioscoController {
    final ProductoService productoService;

    Logger LOG = LoggerFactory.getLogger(KioscoController.class);

    public KioscoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/agregarProducto")
    public ResponseEntity<GenericResponse> agregarProducto(@RequestBody Producto producto) {
        try {
            final Producto response = productoService.agregarProducto(producto);
            return ResponseEntity.ok(response);
        } catch (Exception ex) {
            LOG.error("Error interno del sistema");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new GenericResponse(ex.getMessage()));
        }

    }
}
