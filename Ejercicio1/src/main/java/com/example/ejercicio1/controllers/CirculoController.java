package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Circulo;
import com.example.ejercicio1.services.implementaciones.CirculoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/circulos")
public class CirculoController extends BaseControllerImpl<Circulo, CirculoServiceImpl>{
}
