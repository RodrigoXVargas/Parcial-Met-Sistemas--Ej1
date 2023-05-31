package com.example.ejercicio2.services.implementaciones;

import com.example.ejercicio2.entities.Ciudad;
import com.example.ejercicio2.repositories.RepositoryBase;
import com.example.ejercicio2.services.ServiceBaseImpl;
import com.example.ejercicio2.services.interfaces.CiudadService;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl extends ServiceBaseImpl<Ciudad, Long> implements CiudadService {

    public CiudadServiceImpl(RepositoryBase<Ciudad, Long> repositoryBase) {
        super(repositoryBase);
    }
}
