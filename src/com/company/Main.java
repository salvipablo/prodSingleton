package com.company;

public class Main {
    public static void main(String[] args) {
        //ArrayList<Product> products = new ArrayList<>();
        Products products = new Products();

        // Programador trabajo en la creación de productos informáticos.
            ProductIds idsProdInf = ProductIds.getInstance();

            ComputerProducts computerProducts = new ComputerProducts();
            computerProducts.addProduct(new Product(idsProdInf.nextId(), "Memoria"));
            computerProducts.addProduct(new Product(idsProdInf.nextId(), "Disco"));
            computerProducts.addProduct(new Product(idsProdInf.nextId(), "Pendrive"));
            computerProducts.addProduct(new Product(idsProdInf.nextId(), "Monitor"));

            // Refactored to not use the creation line every time you want to save
            for (Product productComp: computerProducts.getProductsCreated()) {
                products.create(productComp);
            }
        // Programador trabajo en la creación de productos informáticos.

        // Programador trabajo en la creación de productos de limpieza.
        ProductIds idsProdLmp = ProductIds.getInstance();
        Product prodLmp;
        prodLmp = new Product(idsProdLmp.nextId(), "Jabón");
        products.create(prodLmp);
        prodLmp = new Product(idsProdLmp.nextId(), "Desodorante");
        products.create(prodLmp);
        prodLmp = new Product(idsProdLmp.nextId(), "L. Piso");
        products.create(prodLmp);


        // Programador trabajo en la creación de productos de almacén.
        ProductIds idsProdAlm = ProductIds.getInstance();
        Product prodAlm;
        prodAlm = new Product(idsProdAlm.nextId(), "Pan");
        products.create(prodAlm);
        prodAlm = new Product(idsProdAlm.nextId(), "Leche");
        products.create(prodAlm);
        prodAlm = new Product(idsProdAlm.nextId(), "Membrillo");
        products.create(prodAlm);

        listAllProducts(products);

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        // Mas adelante tengo que listar nuevamente los productos
        products.reset();
        listAllProducts(products);
    }

    public static void listAllProducts(Products products) {
        while (products.hasMore()) {
            Product product = products.next();
            System.out.println(product.getId() + " " + product.getName());
        }
    }
}
