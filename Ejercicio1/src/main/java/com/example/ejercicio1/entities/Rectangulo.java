package com.example.ejercicio1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rectangulos")
@Getter
@Setter
@AllArgsConstructor
public class Rectangulo extends Cuadrilatero{
    public Rectangulo(String name, Lado lado1, Lado lado2, Lado lado3, Lado lado4) {
        super(name, lado1, lado2, lado3, lado4);
    }
}
