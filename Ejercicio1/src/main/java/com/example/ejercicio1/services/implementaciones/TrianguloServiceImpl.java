package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Triangulo;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.TrianguloService;

public class TrianguloServiceImpl extends ServiceBaseImpl<Triangulo, Long> implements TrianguloService {

    public TrianguloServiceImpl(RepositoryBase<Triangulo, Long> repositoryBase) {
        super(repositoryBase);
    }
}
