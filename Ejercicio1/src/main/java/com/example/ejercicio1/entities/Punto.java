package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "puntos")
@NoArgsConstructor
@Getter
@Setter
public class Punto extends Base{



    @Column(name = "coordenada_x")
    private int x;

    @Column(name = "coordenada_y")
    private int y;

    public Punto(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }
}
