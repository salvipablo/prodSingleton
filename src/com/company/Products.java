package com.company;

import java.util.ArrayList;

public class Products implements ProductsInterface {
    private final ArrayList<Product> products = new ArrayList<>();
    private int positionNext = 0;

    public void create(Product product) { this.products.add(product); }

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
