package com.example.ejercicio2.services;


import com.example.ejercicio2.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface ServiceBase<E extends Base, ID extends Serializable> {
    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E saveOne(E entity) throws Exception;

    public E updateOne(E entity, ID id) throws Exception;

    public boolean deleteById(ID id) throws Exception;
}
