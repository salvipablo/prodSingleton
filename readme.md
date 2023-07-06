# Porque elegí el patrón Iterator.

Elegí este patrón porque por un lado me permitió, abstraer a otra clase el lugar donde almaceno los productos, ósea coloque la lista de objetos en la clase que implementa el iterador.

Y por otro lado me parece súper interesante, como el método que muestra todos los productos, permite que se lea mejor el programa por otros programadores y tiene mejor semántica. Leer “mientras haya más productos” muestra el siguiente producto, es más claro que estar viendo la cantidad de ítems que quedan, y también abstrae al programador de tener que estar pensando algún método o forma de como ver si existen más ítems. Esto a mi parecer promueve la encapsulación y proporciona una forma estándar de acceder y recorrer los elementos de una colección.