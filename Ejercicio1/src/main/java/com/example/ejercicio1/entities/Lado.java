package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lados")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Lado extends Base{

    @OneToMany(cascade = CascadeType.ALL)
    private List<Punto> puntos = new ArrayList<>();

    public Lado(String name, Punto punto1, Punto punto2) {
        super(name);
        puntos.add(punto1);
        puntos.add(punto2);
    }
}
