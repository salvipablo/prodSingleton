package com.company;

import java.util.ArrayList;

public class ComputerProducts {
    private final ArrayList<Product> prodsInf = new ArrayList<>();

    public void addProduct(Product product) {
        this.prodsInf.add(product);
    }

    public ArrayList<Product> getProductsCreated() {
        return this.prodsInf;
    }
}
