package com.Bancolombia.SucursalVirtualPersonas.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@WebMvcTest(SucursalPersonasControlador.class)// probar de forma aislada el controlador
class SucursalPersonasControladorTest {
    //probar la funcionalidad del control al enviar los argumentos requeridos por la vista

    @Autowired            // vincula el objeto (mock) al BeanFactory de Spring Boot
    private MockMvc mock; //permite simular peticiones http
}