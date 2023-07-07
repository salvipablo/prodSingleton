package com.company;

import java.util.ArrayList;

/**
 * Esta clase es la encargada de llevar el almacenamiento de todos los productos de la empresa, e implementa
 * el patron de diseño Iterator para ir devolviendo cada producto, por si se necesita listarlos. Se vale
 * de un variable de tipo ArrayList, donde quedaran los objetos temporalmente y después se almacenaran en la BBDD.
 * @Autor psalvi
 * @Implements ProductsInterface
 */
public class Products implements ProductsInterface {
    private final ArrayList<Product> products = new ArrayList<>();
    private int positionNext = 0;

    public void create(Product product) { this.products.add(product); }

    // TODO: Realizar funciones para finalizar el CRUD de Productos.

    @Override
    public Product next() {
        Product product = this.products.get(this.positionNext);
        this.positionNext += 1;
        return product;
    }

    @Override
    public boolean hasMore() { return positionNext < this.products.size(); }

    @Override
    public void reset() { this.positionNext = 0; }
}
