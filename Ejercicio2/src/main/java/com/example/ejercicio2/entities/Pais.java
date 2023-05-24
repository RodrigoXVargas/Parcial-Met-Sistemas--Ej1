package com.example.ejercicio2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "paises")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Pais extends Base{

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "continente_fk")
    private Continente continente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Continente> continentesLimitrofes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pais> paiseslimitrofes;

}
