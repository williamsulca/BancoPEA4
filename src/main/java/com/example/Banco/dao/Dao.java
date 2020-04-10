/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banco.dao;

import com.example.banco.modelo.Movimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bancodao")
public class Dao implements IDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int realizarTransferencia(Movimiento movi) {
        String sql = "INSERT INTO movimiento (id_cliente, nro_cuenta, tipo_movi, monto) VALUES (?, ?, ?, ?)";
// INGRESO
        jdbcTemplate.update(
                sql,
                movi.getIdCliente(),
                movi.getNrCuenta(),
                movi.getTipoMovi(),
                movi.getMonto()
        );
// EGRESO
        jdbcTemplate.update(
                sql,
                movi.getIdClienteOtro(),
                movi.getNroCuentaOtro(),
                "ING",
                movi.getMonto()
        );
        return 1;
    }
}
