package com.Bancolombia.SucursalVirtualPersonas.Modelo;

import java.time.LocalDate;

public class Cuenta {

    Cliente cliente;
    String tipoCuenta;
    double numeroCuenta;
    Movimientos movimientos;
    double total;
    LocalDate fecha;

    public Cuenta(Cliente cliente, Movimientos movimientos, double total, LocalDate fecha) {
        this.cliente = cliente;
        this.movimientos = movimientos;
        this.total = total;
        this.fecha = fecha;
    }
}
