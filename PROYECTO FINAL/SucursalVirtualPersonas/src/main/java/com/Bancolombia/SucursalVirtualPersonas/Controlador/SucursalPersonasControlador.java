package com.Bancolombia.SucursalVirtualPersonas.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // especifica que sus metodos contendran peticiones HTTP( Get, Post, Put..)
             //y qur lo mas probable es que retorne una vista ("String")
             //Retornas un documento HTML

public class SucursalPersonasControlador {
 //crear lista con numeros de cuenta para hacer transacciones

 @GetMapping("/usuario")
 public String getValidarUsuario(){
  return "";
 }

 @GetMapping("/clave")
 public String getValidarClave(){
  return "";
 }

 @GetMapping("/sucursalPersonas")
 public String getPaginaPrincipal(){
  return "";
 }

 @GetMapping("/transferencias")
 public String getTransferencias(){
  return "";
 }
}
