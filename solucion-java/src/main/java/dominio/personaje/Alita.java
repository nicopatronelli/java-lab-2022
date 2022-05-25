package dominio.personaje;

import dominio.especialidad.CazadorGuerrero;

public class Alita implements CazadorGuerrero {
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
