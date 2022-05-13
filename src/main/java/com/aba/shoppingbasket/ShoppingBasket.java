package com.aba.shoppingbasket;


import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private final Map<String, Integer> contents = new HashMap<>();

    public void add(String type) {
        int currentCount = contents.get(type) != null ? contents.get(type) : 0;
		contents.put(type, currentCount + 1);
    }

    public int howMany(String type) {
        return contents.get(type);
    }
}
