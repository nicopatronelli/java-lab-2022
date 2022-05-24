package app;

import dominio.personaje.Alita;
import dominio.personaje.Hulk;
import dominio.interfaces.Guerrero;

import java.util.Arrays;
import java.util.List;

public class PruebaGuerreros {
    public static void main(String[] args) {
        Hulk hulk = new Hulk();
        Alita alita = new Alita("espada");
//        List<Guerrero> guerreros = Arrays.asList(alita, hulk);
//        mostrarHabilidadesDePelea(guerreros);
    }

//    private static void mostrarHabilidadesDePelea(List<Guerrero> guerreros) {
//        guerreros.forEach(guerrero -> guerrero.pelear());
//    }
}
