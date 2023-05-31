package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Lado;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.LadoService;
import org.springframework.stereotype.Service;

@Service
public class LadoServiceImpl extends ServiceBaseImpl<Lado, Long> implements LadoService {

    public LadoServiceImpl(RepositoryBase<Lado, Long> repositoryBase) {
        super(repositoryBase);
    }
}
