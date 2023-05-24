package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "puntos")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Punto extends Base{


}
