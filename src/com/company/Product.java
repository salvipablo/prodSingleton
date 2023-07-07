package com.company;

/**
 * Clase que determina los datos que se necesitan para cada producto que se vende.
 * @Autor psalvi
 */
public class Product {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
