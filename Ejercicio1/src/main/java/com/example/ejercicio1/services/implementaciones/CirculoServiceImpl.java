package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Circulo;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.CirculoService;

public class CirculoServiceImpl extends ServiceBaseImpl<Circulo, Long> implements CirculoService {

    public CirculoServiceImpl(RepositoryBase<Circulo, Long> repositoryBase) {
        super(repositoryBase);
    }
}
