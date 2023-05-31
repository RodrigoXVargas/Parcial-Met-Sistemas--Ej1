package com.example.ejercicio2;

import com.example.ejercicio2.entities.Ciudad;
import com.example.ejercicio2.entities.Continente;
import com.example.ejercicio2.entities.Pais;
import com.example.ejercicio2.entities.Provincia;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application {

    public static void main(String[] args) {
        Continente america = new Continente();
        Continente asia = new Continente();
        Continente africa = new Continente();
        Continente oceania = new Continente();
        Continente europa = new Continente();

        america.getContinenteslimitrofes().add(asia);

        asia.getContinenteslimitrofes().add(america);
        asia.getContinenteslimitrofes().add(europa);
        asia.getContinenteslimitrofes().add(africa);

        africa.getContinenteslimitrofes().add(asia);
        africa.getContinenteslimitrofes().add(europa);

        europa.getContinenteslimitrofes().add(asia);
        europa.getContinenteslimitrofes().add(africa);

        Pais argentina = new Pais("Argentina", america);
        Pais chile = new Pais("Chile", america);
        Pais uruguay = new Pais("Uruguay", america);

        argentina.getPaiseslimitrofes().add(chile);
        argentina.getPaiseslimitrofes().add(uruguay);

        Provincia laPampa = new Provincia("La Pampa", false, argentina);
        Provincia buenosAires = new Provincia("Buenos Aires", true, argentina);
        Provincia cordoba = new Provincia("Cordoba", false, argentina);
        Provincia santaFe = new Provincia("Santa Fe", false, argentina);
        Provincia entreRios = new Provincia("Entre Rios", false, argentina);
        Provincia mendoza = new Provincia("Mendoza", false, argentina);

        buenosAires.getProvinciaslimitrofes().add(laPampa);
        buenosAires.getProvinciaslimitrofes().add(cordoba);
        buenosAires.getProvinciaslimitrofes().add(santaFe);
        buenosAires.getProvinciaslimitrofes().add(entreRios);

        entreRios.getProvinciaslimitrofes().add(buenosAires);
        entreRios.getProvinciaslimitrofes().add(santaFe);
        entreRios.getPaisesLimitrofes().add(uruguay);

        Ciudad mendozaCapital = new Ciudad("Mendoza Capital", true, mendoza);
        Ciudad lasHeras = new Ciudad("Las Heras", false, mendoza);

        SpringApplication.run(Ejercicio2Application.class, args);
    }

}
