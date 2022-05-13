package com.aba.shoppingbasket;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ShoppingBasketTest {
	@Test
	public void test1() {
		Item item1 = new Item(1, 1);
		
		ShoppingBasket basket = new ShoppingBasket();
		basket.add(item1);
	}
}
