package com.example.ejercicio2.services.implementaciones;

import com.example.ejercicio2.entities.Pais;
import com.example.ejercicio2.repositories.RepositoryBase;
import com.example.ejercicio2.services.ServiceBaseImpl;
import com.example.ejercicio2.services.interfaces.PaisService;

public class PaisServiceImpl extends ServiceBaseImpl<Pais, Long> implements PaisService {

    public PaisServiceImpl(RepositoryBase<Pais, Long> repositoryBase) {
        super(repositoryBase);
    }
}
