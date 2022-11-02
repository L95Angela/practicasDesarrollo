package com.Bancolombia.SucursalVirtualPersonas.Modelo;

public class Cliente extends Persona{
    String usuario;
    String contraseña;
    String nroCuenta;
    String tipoCuenta;

    public Cliente(String nroCuenta, String tipoCuenta, String contraseña, String usuario) {
        this.nroCuenta = nroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
        this.contraseña = contraseña;

    }


    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
