import {Alita} from './dominio/personajes/Alita.js';
import {Hulk} from './dominio/personajes/Hulk.js';

// Guerreros 
const alita = new Alita("espada");
const hulk = new Hulk();

const guerreros = [alita, hulk];

guerreros.forEach(guerrero => guerrero.pelear());
