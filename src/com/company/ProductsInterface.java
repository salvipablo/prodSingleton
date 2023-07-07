package com.company;

/**
 * Interface que marca la implementacion que necesita la clase Products para llevar adelante el patron Iterator
 * @see https://refactoring.guru/es/design-patterns/iterator
 */
public interface ProductsInterface {
    Product next();
    boolean hasMore();
    void reset();
}
