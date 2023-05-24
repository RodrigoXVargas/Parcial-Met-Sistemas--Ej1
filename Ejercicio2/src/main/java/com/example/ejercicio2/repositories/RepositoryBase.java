package com.example.ejercicio2.repositories;

import com.example.ejercicio2.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface RepositoryBase<E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {
}
