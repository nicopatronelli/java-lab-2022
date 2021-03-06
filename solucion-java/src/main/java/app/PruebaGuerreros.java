package app;

import dominio.especialidad.Guerrero;
import dominio.personaje.Alita;
import dominio.personaje.Hulk;

import java.util.Arrays;
import java.util.List;

public class PruebaGuerreros {
    public static void main(String[] args) {
        Hulk hulk = new Hulk();
        Alita alita = new Alita("espada");
        List<Guerrero> guerreros = Arrays.asList(alita, hulk);
        guerreros.forEach(guerrero -> guerrero.pelear());
    }
}
