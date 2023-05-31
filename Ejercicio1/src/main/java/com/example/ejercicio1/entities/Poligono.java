package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "poligonos")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Poligono extends FiguraBasica {

    @OneToMany(cascade = CascadeType.ALL)
    private List<Lado> lados = new ArrayList<>();

    public Poligono(String name) {
        super(name);
    }
}
