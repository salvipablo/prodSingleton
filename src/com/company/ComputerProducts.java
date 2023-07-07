package com.company;

import java.util.ArrayList;

/**
 * Clase que lleva el almacenamiento de los productos de informatica
 * @Autor JSmith
 */
public class ComputerProducts {
    private final ArrayList<Product> prodsInf = new ArrayList<>();

    public void addProduct(Product product) {
        this.prodsInf.add(product);
    }

    public ArrayList<Product> getProductsCreated() {
        return this.prodsInf;
    }
}
