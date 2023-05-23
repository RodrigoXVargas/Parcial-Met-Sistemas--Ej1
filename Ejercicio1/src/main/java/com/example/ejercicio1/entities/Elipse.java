package com.example.ejercicio1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "elipses")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Elipse extends FiguraBasica {
}
