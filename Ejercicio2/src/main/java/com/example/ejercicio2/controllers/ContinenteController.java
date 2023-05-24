package com.example.ejercicio2.controllers;

import com.example.ejercicio2.entities.Continente;
import com.example.ejercicio2.services.implementaciones.ContinenteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/continentes")
public class ContinenteController extends BaseControllerImpl<Continente, ContinenteServiceImpl>{
}
