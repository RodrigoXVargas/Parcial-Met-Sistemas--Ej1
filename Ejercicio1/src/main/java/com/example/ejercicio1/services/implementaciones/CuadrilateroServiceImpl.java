package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Cuadrilatero;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.CuadrilateroService;

public class CuadrilateroServiceImpl extends ServiceBaseImpl<Cuadrilatero, Long> implements CuadrilateroService {

    public CuadrilateroServiceImpl(RepositoryBase<Cuadrilatero, Long> repositoryBase) {
        super(repositoryBase);
    }
}
