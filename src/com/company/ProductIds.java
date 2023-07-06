package com.company;

import java.util.ArrayList;

public class ProductIds {
    private static ProductIds productIds;
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
