package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Poligono;
import com.example.ejercicio1.services.implementaciones.PoligonoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Poligonos")
public class PoligonoController extends BaseControllerImpl<Poligono, PoligonoServiceImpl>{
}
