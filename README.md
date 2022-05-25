# Solución utilizando un lenguaje dinámicamente tipado (JavaScript en este caso particular)
Para correr el código es necesario tener instalado Node.js

Pueden hacerlo desde el sitio oficial si están en Windows (https://nodejs.org/en/)
o por consola si usan Mac o alguna distribución de Linux (como Ubuntu por ejemplo).

Para verificar que Node esté correctamente instalado pueden ejecutar el comando:

node -v 

Debería imprimirse la versión de Node que tienen instalada (en mi caso la v16.15.0).

Luego, simplemente se ubican dentro del directorio /solucion-js/app y ejecutan el comando
node <nombre_script_js>. 

Así, para ejecutar la prueba de cazadores hacemos:

node prueba_cazadores.js

Y para el de guerreros:

node prueba_guerreros.js

# Solución utilizando un lenguaje estáticamente tipado (usamos Java)
Para la solución usamos Java 8. Partimos de una primera aproximación en donde no se pueden utilizar herencia (ni por medio de 
clases concretas ni abstractas) ni tampoco interfaces. Luego permitimos el uso de herencia y finalmente arribamos a la solución 
definitiva utilizando interfaces.


