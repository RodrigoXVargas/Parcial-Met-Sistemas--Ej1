package com.example.ejercicio2.services.implementaciones;

import com.example.ejercicio2.entities.Provincia;
import com.example.ejercicio2.repositories.RepositoryBase;
import com.example.ejercicio2.services.ServiceBaseImpl;
import com.example.ejercicio2.services.interfaces.ProvinciaService;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaServiceImpl extends ServiceBaseImpl<Provincia, Long> implements ProvinciaService {

    public ProvinciaServiceImpl(RepositoryBase<Provincia, Long> repositoryBase) {
        super(repositoryBase);
    }
}
