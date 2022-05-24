import {Alita} from './dominio/personajes/Alita.js';
import {Blade} from './dominio/personajes/Blade.js';

// Cazadores 
const alita = new Alita();
const hulk = new Blade();

const guerreros = [alita, hulk];

guerreros.forEach(guerrero => guerrero.cazar());
