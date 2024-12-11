package com.aba.shoppingbasket;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShoppingBasketTest {


    private final ShoppingBasket basket = new ShoppingBasket();

    @Test
    public void recognizesSingleItemOfType() {
        basket.add(Type.FOO);

        assertThat(basket.howMany(Type.FOO), is(1));
    }

    @Test
    public void recognizesMultipleItemOfType() {
        basket.add(Type.FOO);
        basket.add(Type.FOO);
        basket.add(Type.FOO);

        assertThat(basket.howMany(Type.FOO), is(3));
    }

	@Test
    public void recognizesDifferentItemTypes() {
		basket.add(Type.FIGHTERS);
		basket.add(Type.FIGHTERS);
		basket.add(Type.FOO);

		assertThat(basket.howMany(Type.FOO), is(1));
		assertThat(basket.howMany(Type.FIGHTERS), is(2));

    }
}
