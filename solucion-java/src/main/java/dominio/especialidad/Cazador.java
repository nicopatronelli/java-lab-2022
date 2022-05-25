package dominio.especialidad;

import dominio.excepcion.NoSabeCazarException;

public abstract class Cazador {
	public abstract void cazar() throws NoSabeCazarException;
}
