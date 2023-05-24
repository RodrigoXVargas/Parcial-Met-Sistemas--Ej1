package com.example.ejercicio2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "provincias")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Provincia extends Base {

    @Column
    private boolean esCapital;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pais_fk")
    private Pais pais;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pais> paisesLimitrofes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Provincia> provinciaslimitrofes;


}
