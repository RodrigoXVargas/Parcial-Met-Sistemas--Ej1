package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Triangulo;
import com.example.ejercicio1.services.implementaciones.TrianguloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Triangulos")
public class TrianguloController extends BaseControllerImpl<Triangulo, TrianguloServiceImpl>{
}
