package com.example.ejercicio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "circulos")
@Getter
@Setter
@AllArgsConstructor
public class Circulo extends Elipse{
    public Circulo(String name) {
        super(name);
    }
}
