package com.example.ejercicio2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paises")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Pais extends Base{

    @Column
    private String Nombre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "continente_fk")
    private Continente continente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Continente> continentesLimitrofes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pais> paiseslimitrofes = new ArrayList<>();

    public Pais(String nombre, Continente continente) {
        Nombre = nombre;
        this.continente = continente;
    }
}
