package com.example.ejercicio1.controllers;

import com.example.ejercicio1.entities.Lado;
import com.example.ejercicio1.services.implementaciones.LadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/Lados")
public class LadoController extends BaseControllerImpl<Lado, LadoServiceImpl>{
}
