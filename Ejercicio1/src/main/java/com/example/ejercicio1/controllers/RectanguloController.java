package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Rectangulo;
import com.example.ejercicio1.services.implementaciones.RectanguloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Rectangulos")
public class RectanguloController extends BaseControllerImpl<Rectangulo, RectanguloServiceImpl>{
}
