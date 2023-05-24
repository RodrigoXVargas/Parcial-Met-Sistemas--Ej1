package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Punto;
import com.example.ejercicio1.services.implementaciones.PuntoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Puntos")
public class PuntoController extends BaseControllerImpl<Punto, PuntoServiceImpl>{
}
