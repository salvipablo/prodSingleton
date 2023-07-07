package com.company;

import java.util.ArrayList;

/**
 * Esta clase se encarga de llevar los ID unicos de todos los productos que se iran almacenando en la BBDD.
 * Esta clase está implementando el patron de diseño Singleton para evitar que se generen ID duplicados.
 * @see https://refactoring.guru/es/design-patterns/singleton
 * @Autor psalvi
 */
public class ProductIds {
    private static ProductIds productIds;

    /**
     * Lista de ids unicos para los productos.
     */
    private final ArrayList<Integer> ids = new ArrayList<>();

    private ProductIds() {}

    public static ProductIds getInstance() {
        if (productIds == null) productIds = new ProductIds();
        return productIds;
    }

    public int nextId() {
        int lastID = this.ids.size();
        int nextID = lastID + 1;
        ids.add(nextID);
        return nextID;
    }
}
