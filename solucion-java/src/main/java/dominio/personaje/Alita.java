package dominio.personaje;

import dominio.especialidad.Cazador;
import dominio.especialidad.Guerrero;

public class Alita implements Cazador, Guerrero {
    private String arma;

    public Alita(String arma) {
        this.arma = arma;
    }

    @Override
    public void pelear() {
        System.out.println("Alita pelea utilizando su " + this.arma + " ...");
    }

    @Override
    public void cazar() {
        System.out.println("Alita sale a la caza de un ladrón muy buscado ...");
    }
}
