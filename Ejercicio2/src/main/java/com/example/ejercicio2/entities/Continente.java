package com.example.ejercicio2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "continentes")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Continente extends Base{

    @OneToMany(cascade = CascadeType.ALL)
    private List<Continente> continenteslimitrofes;
}
