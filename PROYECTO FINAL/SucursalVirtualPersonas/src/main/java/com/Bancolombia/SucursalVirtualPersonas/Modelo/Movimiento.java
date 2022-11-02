package com.Bancolombia.SucursalVirtualPersonas.Modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movimiento {
    private double valor;
    private LocalDate fecha;
    private LocalTime hora;
    private Cuenta cuentaEnvio;

    public Movimiento(double valor) {
        this.valor = valor;

    }

    public double getValor() {
        return valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }


    public LocalTime getHora() {
        return hora;
    }

    public Cuenta getCuentaEnvio() {
        return cuentaEnvio;
    }

}