package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Cuadrado;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.CuadradoService;
import org.springframework.stereotype.Service;

@Service
public class CuadradoServiceImpl extends ServiceBaseImpl<Cuadrado, Long> implements CuadradoService {

    public CuadradoServiceImpl(RepositoryBase<Cuadrado, Long> repositoryBase) {
        super(repositoryBase);
    }
}
