package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        // Programador trabajo en la creación de productos informáticos.
        ProductIds idsProdInf = ProductIds.getInstance();
        Product prodInf;
        prodInf = new Product(idsProdInf.nextId(), "Memoria");
        products.add(prodInf);
        prodInf = new Product(idsProdInf.nextId(), "Disco");
        products.add(prodInf);
        prodInf = new Product(idsProdInf.nextId(), "Pendrive");
        products.add(prodInf);
        prodInf = new Product(idsProdInf.nextId(), "Monitor");
        products.add(prodInf);


        // Programador trabajo en la creación de productos de limpieza.
        ProductIds idsProdLmp = ProductIds.getInstance();
        Product prodLmp;
        prodLmp = new Product(idsProdLmp.nextId(), "Jabón");
        products.add(prodLmp);
        prodLmp = new Product(idsProdLmp.nextId(), "Desodorante");
        products.add(prodLmp);
        prodLmp = new Product(idsProdLmp.nextId(), "L. Piso");
        products.add(prodLmp);


        // Programador trabajo en la creación de productos de almacén.
        ProductIds idsProdAlm = ProductIds.getInstance();
        Product prodAlm;
        prodAlm = new Product(idsProdAlm.nextId(), "Pan");
        products.add(prodAlm);
        prodAlm = new Product(idsProdAlm.nextId(), "Leche");
        products.add(prodAlm);
        prodAlm = new Product(idsProdAlm.nextId(), "Membrillo");
        products.add(prodAlm);

        // Muestro productos cargados.
        for (Product product: products) {
            System.out.println(product.getId() + " " + product.getName());
        }

        System.out.println();
        System.out.println("Posición de memoria de los 3 objetos que apuntan al Singleton");
        System.out.println(idsProdInf);
        System.out.println(idsProdLmp);
        System.out.println(idsProdAlm);
    }
}
