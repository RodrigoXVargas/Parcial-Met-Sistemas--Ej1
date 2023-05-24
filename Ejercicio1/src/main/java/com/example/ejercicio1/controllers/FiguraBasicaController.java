package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.FiguraBasica;
import com.example.ejercicio1.services.implementaciones.FiguraBasicaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/FiguraBasicas")
public class FiguraBasicaController extends BaseControllerImpl<FiguraBasica, FiguraBasicaServiceImpl>{
}
