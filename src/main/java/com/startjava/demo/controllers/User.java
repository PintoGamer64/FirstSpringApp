package com.startjava.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startjava.demo.models.UserModel;

@RestController
public class User {
    
    @RequestMapping(value = "Prueba")
    public UserModel Prueba() {
        UserModel usuario = new UserModel();
        usuario.setName("Pedro Gonsalez");
        usuario.setEmail("eaxmple@gmail.com");
        usuario.setPassword("PedroGonzales16");
        return usuario;
    }

}
