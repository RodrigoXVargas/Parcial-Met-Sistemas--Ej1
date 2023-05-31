package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Poligono;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.PoligonoService;
import org.springframework.stereotype.Service;

@Service
public class PoligonoServiceImpl extends ServiceBaseImpl<Poligono, Long> implements PoligonoService {

    public PoligonoServiceImpl(RepositoryBase<Poligono, Long> repositoryBase) {
        super(repositoryBase);
    }
}
