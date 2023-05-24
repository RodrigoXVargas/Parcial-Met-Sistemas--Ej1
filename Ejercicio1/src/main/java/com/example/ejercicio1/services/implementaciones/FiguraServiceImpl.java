package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Figura;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.FiguraService;

public class FiguraServiceImpl extends ServiceBaseImpl<Figura, Long> implements FiguraService {

    public FiguraServiceImpl(RepositoryBase<Figura, Long> repositoryBase) {
        super(repositoryBase);
    }
}
