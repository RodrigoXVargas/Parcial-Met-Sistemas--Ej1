package com.example.ejercicio1.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "poligonos")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Poligono extends FiguraBasica {

    @OneToMany(mappedBy = "poligono",
            cascade = CascadeType.ALL)
    private List<Lado> lados;

}
