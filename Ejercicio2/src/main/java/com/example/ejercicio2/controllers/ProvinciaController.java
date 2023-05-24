package com.example.ejercicio2.controllers;

import com.example.ejercicio2.entities.Provincia;
import com.example.ejercicio2.services.implementaciones.ProvinciaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaServiceImpl>{
}
