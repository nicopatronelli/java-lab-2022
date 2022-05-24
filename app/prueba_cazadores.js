import {Alita} from './dominio/personajes/Alita.js';
import {Buffy} from './dominio/personajes/Buffy.js';

// Cazadores 
const alita = new Alita("espada");
const buffy = new Buffy();

const cazadores = [alita, buffy];

cazadores.forEach(cazador => cazador.cazar());
