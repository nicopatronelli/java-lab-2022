package dominio.personaje;

import dominio.especialidad.Guerrero;
import dominio.excepcion.NoSabeCazarException;

public class Hulk extends Guerrero {
    @Override
    public void pelear() {
        double random = Math.random();
        if (random < 0.5)
            System.out.println("Hulk se enfada y da un puñetazo con su brazo izquierdo ...");
        else
            System.out.println("Hulk se enfada y pelea utilizando su puño derecho ...");
    }

    @Override
    public void cazar() throws NoSabeCazarException {
        throw new NoSabeCazarException("Hulk no sabe cazar.");
    }
}
