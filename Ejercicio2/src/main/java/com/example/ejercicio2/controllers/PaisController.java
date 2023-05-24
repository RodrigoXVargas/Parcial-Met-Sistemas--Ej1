package com.example.ejercicio2.controllers;

import com.example.ejercicio2.entities.Pais;
import com.example.ejercicio2.services.implementaciones.PaisServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/paises")
public class PaisController extends BaseControllerImpl<Pais, PaisServiceImpl>{
}
