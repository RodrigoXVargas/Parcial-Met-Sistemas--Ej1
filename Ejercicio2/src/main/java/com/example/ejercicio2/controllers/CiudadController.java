package com.example.ejercicio2.controllers;

import com.example.ejercicio2.entities.Ciudad;
import com.example.ejercicio2.services.implementaciones.CiudadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/ciudades")
public class CiudadController extends BaseControllerImpl<Ciudad, CiudadServiceImpl>{
}
