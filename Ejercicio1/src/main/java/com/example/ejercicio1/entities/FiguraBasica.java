package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "figurasbasicas")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class FiguraBasica extends Base{

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "figura_fk")
    private Figura figura;
}
