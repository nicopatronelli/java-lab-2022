package dominio.personaje;

import dominio.especialidad.Cazador;

public class Buffy extends Cazador {
    @Override
    public void cazar() {
        System.out.println("Buffy sale a la caza de un vampiro muy peligroso ...");
    }
}
