package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Rectangulo;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.RectanguloService;

public class RectanguloServiceImpl extends ServiceBaseImpl<Rectangulo, Long> implements RectanguloService {

    public RectanguloServiceImpl(RepositoryBase<Rectangulo, Long> repositoryBase) {
        super(repositoryBase);
    }
}
