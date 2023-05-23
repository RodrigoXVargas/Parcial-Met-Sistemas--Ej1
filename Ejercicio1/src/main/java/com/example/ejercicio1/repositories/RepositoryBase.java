package com.example.ejercicio1.repositories;

import com.example.ejercicio1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositoryBase<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
