package com.example.ejercicio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cuadrilateros")
@Getter
@Setter
@AllArgsConstructor
public class Cuadrilatero extends Poligono {
    public Cuadrilatero(String name, Lado lado1, Lado lado2, Lado lado3, Lado lado4) {
        super(name);
        getLados().add(lado1);
        getLados().add(lado2);
        getLados().add(lado3);
        getLados().add(lado4);
    }
}
