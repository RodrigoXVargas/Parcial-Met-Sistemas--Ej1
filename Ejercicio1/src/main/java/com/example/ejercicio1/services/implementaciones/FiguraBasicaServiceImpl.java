package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.FiguraBasica;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.FiguraBasicaService;

public class FiguraBasicaServiceImpl extends ServiceBaseImpl<FiguraBasica, Long> implements FiguraBasicaService {

    public FiguraBasicaServiceImpl(RepositoryBase<FiguraBasica, Long> repositoryBase) {
        super(repositoryBase);
    }
}
