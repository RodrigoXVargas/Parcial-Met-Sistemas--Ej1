package com.example.ejercicio2.services.implementaciones;

import com.example.ejercicio2.entities.Continente;
import com.example.ejercicio2.repositories.RepositoryBase;
import com.example.ejercicio2.services.ServiceBaseImpl;
import com.example.ejercicio2.services.interfaces.ContinenteService;
import org.springframework.stereotype.Service;

@Service
public class ContinenteServiceImpl extends ServiceBaseImpl<Continente, Long> implements ContinenteService {

    public ContinenteServiceImpl(RepositoryBase<Continente, Long> repositoryBase) {
        super(repositoryBase);
    }
}
