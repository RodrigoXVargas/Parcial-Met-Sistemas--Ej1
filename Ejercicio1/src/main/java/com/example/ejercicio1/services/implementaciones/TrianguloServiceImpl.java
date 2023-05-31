package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Triangulo;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.TrianguloService;
import org.springframework.stereotype.Service;

@Service
public class TrianguloServiceImpl extends ServiceBaseImpl<Triangulo, Long> implements TrianguloService {

    public TrianguloServiceImpl(RepositoryBase<Triangulo, Long> repositoryBase) {
        super(repositoryBase);
    }
}
