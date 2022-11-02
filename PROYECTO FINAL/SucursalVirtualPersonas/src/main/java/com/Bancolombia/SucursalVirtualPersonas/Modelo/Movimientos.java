package com.Bancolombia.SucursalVirtualPersonas.Modelo;

import java.util.ArrayList;

public class Movimientos extends ArrayList<Movimiento> {

    private double sumaMovimientos, promedio;



    @Override
    public boolean add(Movimiento movimiento) {
        boolean resultado = false;
        if(movimiento != null){
            resultado = super.add(movimiento);
            if(resultado){
                sumaMovimientos += movimiento.getValor();
                promedio = sumaMovimientos/this.size();
            }
        }
        return resultado;
    }

    public double getSumaMovimientos() {
        return sumaMovimientos;
    }

    public double getPromedio() {
        return promedio;
    }
}
