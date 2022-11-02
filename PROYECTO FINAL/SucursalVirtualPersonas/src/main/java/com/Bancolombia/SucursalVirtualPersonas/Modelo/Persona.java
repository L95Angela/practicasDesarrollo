package com.Bancolombia.SucursalVirtualPersonas.Modelo;

public class Persona {
    String nombre;
    String apellido;
    String documento;
    String NroDocumento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, String nroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        NroDocumento = nroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNroDocumento() {
        return NroDocumento;
    }
}
