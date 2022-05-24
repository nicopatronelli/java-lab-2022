import {Alita} from './dominio/personajes/Alita.js';
import {Blade} from './dominio/personajes/Blade.js';

// Cazadores 
const alita = new Alita();
const hulk = new Blade();

const cazadores = [alita, hulk];

cazadores.forEach(cazador => cazador.cazar());
