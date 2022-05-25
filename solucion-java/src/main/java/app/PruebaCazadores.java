package app;

import dominio.especialidad.Cazador;
import dominio.excepcion.NoSabeCazarException;
import dominio.personaje.Alita;
import dominio.personaje.Buffy;

import java.util.Arrays;
import java.util.List;

public class PruebaCazadores {
    public static void main(String[] args) {
        Buffy buffy = new Buffy();
        Alita alita = new Alita("espada");
        List<Cazador> cazadores = Arrays.asList(buffy, alita);
        cazadores.forEach(cazador -> {
            try {
                cazador.cazar();
            } catch (NoSabeCazarException e) {
//              Un personaje de la lista puede no saber cazar
                e.printStackTrace();
            }
        });
    }

}
