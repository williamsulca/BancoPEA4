/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banco.api;

import com.example.banco.modelo.Movimiento;
import com.example.banco.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/banco")
@RestController
public class Controlador {

    private final Servicio servicio;

// INYECCION DE DEPENDENCIAS
    @Autowired
    public Controlador(Servicio __servicio) {
        this.servicio = __servicio;
    }

    @RequestMapping("/realizarTransferencia")
    @PostMapping
    public int realizarTransferencia(@RequestBody Movimiento movi) {
        return servicio.realizarTransferencia(movi);
    }
}
