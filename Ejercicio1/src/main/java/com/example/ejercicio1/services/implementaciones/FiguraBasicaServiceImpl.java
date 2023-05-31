package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.FiguraBasica;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.FiguraBasicaService;
import org.springframework.stereotype.Service;

@Service
public class FiguraBasicaServiceImpl extends ServiceBaseImpl<FiguraBasica, Long> implements FiguraBasicaService {

    public FiguraBasicaServiceImpl(RepositoryBase<FiguraBasica, Long> repositoryBase) {
        super(repositoryBase);
    }
}
