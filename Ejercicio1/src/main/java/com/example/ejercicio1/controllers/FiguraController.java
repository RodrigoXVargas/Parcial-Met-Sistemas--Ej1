package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Elipse;
import com.example.ejercicio1.entities.Figura;
import com.example.ejercicio1.services.implementaciones.ElipseServiceImpl;
import com.example.ejercicio1.services.implementaciones.FiguraServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Figuras")
public class FiguraController extends BaseControllerImpl<Figura, FiguraServiceImpl>{
}
