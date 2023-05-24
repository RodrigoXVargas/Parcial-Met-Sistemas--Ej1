package com.example.ejercicio2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ciudades")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Ciudad extends Base {

    @Column
    private boolean esCapital;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "provincia_fk")
    private Provincia provincia;
}
