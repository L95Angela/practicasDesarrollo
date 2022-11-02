package com.Bancolombia.SucursalVirtualPersonas.Modelo;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
 private Persona Angela;

 @BeforeEach
 public void crearAngela(){
 Angela = new Persona("Angela","Cruz","Cedula de ciudadania","123456");

 Angela = new Cliente("24681","Ahorros","123","luacruz");

 }
}