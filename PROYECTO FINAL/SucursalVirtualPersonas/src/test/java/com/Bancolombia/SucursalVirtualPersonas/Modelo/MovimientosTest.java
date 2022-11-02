package com.Bancolombia.SucursalVirtualPersonas.Modelo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovimientosTest {


    Movimientos movimientos = new Movimientos();
    @BeforeEach
    public void setUp(){

        movimientos.add(new Movimiento(50_000_000));
        movimientos.add(new Movimiento(6_000_000));
    }

    @Test
    public void sumaMovimientos(){

        assertEquals(56_000_000,movimientos.getSumaMovimientos());
        movimientos.add(new Movimiento(-6_000_000));
        assertEquals(50_000_000,movimientos.getSumaMovimientos());
    }

    @Test
    public void promedioMovimientos(){

    }

    @Test
    public void sumaMovimientosNulos(){
        movimientos.add(null);
        assertEquals(56_000_000,movimientos.getSumaMovimientos());
    }

}