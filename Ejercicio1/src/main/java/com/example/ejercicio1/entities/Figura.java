package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "figuras")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Figura extends Base{


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FiguraBasica> figurasBasicas = new ArrayList<>();


    public Figura(String name) {
        super(name);
    }
}
