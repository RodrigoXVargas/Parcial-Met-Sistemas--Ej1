package com.example.ejercicio1.services.implementaciones;

import com.example.ejercicio1.entities.Elipse;
import com.example.ejercicio1.repositories.RepositoryBase;
import com.example.ejercicio1.services.ServiceBaseImpl;
import com.example.ejercicio1.services.interfaces.ElipseService;
import org.springframework.stereotype.Service;

@Service
public class ElipseServiceImpl extends ServiceBaseImpl<Elipse, Long> implements ElipseService {

    public ElipseServiceImpl(RepositoryBase<Elipse, Long> repositoryBase) {
        super(repositoryBase);
    }
}
