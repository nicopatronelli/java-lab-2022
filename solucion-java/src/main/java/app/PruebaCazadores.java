package app;

import dominio.personaje.Alita;
import dominio.personaje.Buffy;
import dominio.interfaces.Cazador;

import java.util.Arrays;
import java.util.List;

public class PruebaCazadores {
    public static void main(String[] args) {
        Buffy buffy = new Buffy();
        Alita alita = new Alita("espada");
//        List cazadores = Arrays.asList(buffy, alita);
//        salirACazar(cazadores);
    }

//    private static void salirACazar(List cazadores) {
//        cazadores.forEach(cazador -> cazador.cazar());
//    }
}
