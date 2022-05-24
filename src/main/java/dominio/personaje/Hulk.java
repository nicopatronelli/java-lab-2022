package dominio.personaje;

public class Hulk {
    public void pelear() {
        double random = Math.random();
        if (random < 0.5)
            System.out.println("Hulk se enfada y da un puñetazo con su brazo izquierdo ...");
        else
            System.out.println("Hulk se enfada y pelea utilizando su puño derecho ...");
    }
}
