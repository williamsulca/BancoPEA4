/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.banco.modelo;

/**
 *
 * @author mare
 */
public class Movimiento {

    private int idCliente;
    private int idClienteOtro;
    private String nrCuenta;
    private String nroCuentaOtro;
    private String tipoMovi;
    private Double monto;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNrCuenta() {
        return nrCuenta;
    }

    public void setNrCuenta(String nrCuenta) {
        this.nrCuenta = nrCuenta;
    }

    public String getTipoMovi() {
        return tipoMovi;
    }

    public void setTipoMovi(String tipoMovi) {
        this.tipoMovi = tipoMovi;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getIdClienteOtro() {
        return idClienteOtro;
    }

    public void setIdClienteOtro(int idClienteOtro) {
        this.idClienteOtro = idClienteOtro;
    }

    public String getNroCuentaOtro() {
        return nroCuentaOtro;
    }

    public void setNroCuentaOtro(String nroCuentaOtro) {
        this.nroCuentaOtro = nroCuentaOtro;
    }

}
