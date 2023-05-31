package com.example.ejercicio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cuadrados")
@Getter
@Setter
@AllArgsConstructor
public class Cuadrado extends Rectangulo{
    public Cuadrado(String name, Lado lado1, Lado lado2, Lado lado3, Lado lado4) {
        super(name, lado1, lado2, lado3, lado4);
    }
}
