/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banco.dao;

import com.example.banco.modelo.Movimiento;

public interface IDao {

    int realizarTransferencia(Movimiento movi);
}
