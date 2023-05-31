package com.example.ejercicio1;

import com.example.ejercicio1.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		Punto punto1 = new Punto("punto1", 1, 2);
		Punto punto2 = new Punto("punto2", 2, 3);
		Punto punto3 = new Punto("punto3", 3, 4);
		Punto punto4 = new Punto("punto4", 4, 5);
		Punto punto5 = new Punto("punto5", 5, 6);
		Punto punto6 = new Punto("punto6", 6, 7);
		Punto punto7 = new Punto("punto7", 7, 8);
		Punto punto8 = new Punto("punto8", 8, 9);

		Lado lado1 = new Lado("lado1", punto1, punto2);
		Lado lado2 = new Lado("lado2", punto2, punto3);
		Lado lado3 = new Lado("lado3", punto3, punto4);
		Lado lado4 = new Lado("lado4", punto4, punto5);
		Lado lado5 = new Lado("lado5", punto5, punto6);
		Lado lado6 = new Lado("lado6", punto6, punto7);
		Lado lado7 = new Lado("lado7", punto7, punto8);

		Poligono triangulo = new Triangulo("triangulo", lado1, lado2, lado3);
		Poligono cuadrado = new Cuadrado("cuadrado", lado4, lado5, lado6, lado7);
		Elipse elipse = new Circulo("circulo");

		FiguraBasica figuraBasica = elipse;
		FiguraBasica poligono = cuadrado;

		Figura figura = new Figura("figura");
		figura.getFigurasBasicas().add(poligono);
		figura.getFigurasBasicas().add(figuraBasica);
		figura.getFigurasBasicas().add(triangulo);

		SpringApplication.run(Ejercicio1Application.class, args);
	}

}
