package app;

import dominio.especialidad.Cazador;
import dominio.personaje.Alita;
import dominio.personaje.Buffy;

import java.util.Arrays;
import java.util.List;

public class PruebaCazadores {
    public static void main(String[] args) {
        Buffy buffy = new Buffy();
        Alita alita = new Alita("espada");
        List<Cazador> cazadores = Arrays.asList(buffy, alita);
        cazadores.forEach(cazador -> cazador.cazar());
    }

}
