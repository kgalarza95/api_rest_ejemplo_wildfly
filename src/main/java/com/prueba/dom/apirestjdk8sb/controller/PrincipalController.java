package com.prueba.dom.apirestjdk8sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @fecha 12/05/2023
 * @author kgalarza
 */
@RestController
@RequestMapping("/api")
public class PrincipalController {

    @GetMapping("/data")
    public String getApi() {
        return "hola mundo";
    }

}
