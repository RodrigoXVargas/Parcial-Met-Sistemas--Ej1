package com.example.ejercicio1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "figurasbasicas")
@Getter
@Setter
@AllArgsConstructor
public class FiguraBasica extends Base{
    public FiguraBasica(String name) {
        super(name);
    }
}
