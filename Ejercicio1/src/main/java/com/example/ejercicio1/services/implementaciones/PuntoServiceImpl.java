package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Punto;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.PuntoService;
import org.springframework.stereotype.Service;

@Service
public class PuntoServiceImpl extends ServiceBaseImpl<Punto, Long> implements PuntoService {

    public PuntoServiceImpl(RepositoryBase<Punto, Long> repositoryBase) {
        super(repositoryBase);
    }
}
