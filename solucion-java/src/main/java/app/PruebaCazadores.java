package app;

import dominio.personaje.Alita;
import dominio.personaje.Buffy;

import java.util.Arrays;
import java.util.List;

public class PruebaCazadores {
    public static void main(String[] args) {
        Buffy buffy = new Buffy();
        Alita alita = new Alita("espada");
        List<Object> cazadores = Arrays.asList(buffy, alita);
        cazadores.forEach(cazador -> ((Alita)cazador).cazar());
    }

}
