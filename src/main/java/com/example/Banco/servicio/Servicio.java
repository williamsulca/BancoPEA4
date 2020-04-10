/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banco.servicio;

import com.example.banco.dao.Dao;
import com.example.banco.modelo.Movimiento;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Servicio {

    private final Dao dao;

    public Servicio(@Qualifier("bancodao") Dao __dao) {
        this.dao = __dao;
    }

    public int realizarTransferencia(@RequestBody Movimiento movi) {
        return dao.realizarTransferencia(movi);
    }
}
