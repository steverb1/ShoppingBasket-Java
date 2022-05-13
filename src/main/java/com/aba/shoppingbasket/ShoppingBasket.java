package com.aba.shoppingbasket;


import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private final Map<Type, Integer> contents = new HashMap<>();

    public void add(Type type) {
        int currentCount = contents.get(type) != null ? contents.get(type) : 0;
		contents.put(type, currentCount + 1);
    }

    public int howMany(Type type) {
        return contents.get(type);
    }
}
