package com.aba.shoppingbasket;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

public class ShoppingBasketTest {
	@Test
	public void recognizesSingleItemOfType() {
		ShoppingBasket basket = new ShoppingBasket();
		basket.add("foo");

		assertThat(basket.howMany("foo"), is(1));
	}
}
