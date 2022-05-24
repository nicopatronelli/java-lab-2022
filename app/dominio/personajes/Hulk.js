export class Hulk {
    pelear() {
        const random = Math.random();
        if (random < 0.5)
            console.log("Hulk se enfada y da un puñetazo con su brazo izquierdo ...");
        else
            console.log("Hulk se enfada y pelea utilizando su puño derecho ...");
    }
}