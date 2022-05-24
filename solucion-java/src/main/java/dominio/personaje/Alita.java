package dominio.personaje;

public class Alita {
    private String arma;

    public Alita(String arma) {
        this.arma = arma;
    }

    public void pelear() {
        System.out.println("Alita pelea utilizando su " + this.arma + " ...");
    }

    public void cazar() {
        System.out.println("Alita sale a la caza a un ladrón muy buscado ...");
    }
}
