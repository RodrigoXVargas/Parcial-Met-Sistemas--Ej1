package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lados")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Lado extends Base{

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "poligono_fk")
    private Poligono poligono;

}
