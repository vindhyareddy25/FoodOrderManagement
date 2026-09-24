package com.foodorder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FoodOrderTest {

    @Test
    void testCalculateTotal() {
        FoodOrder order = new FoodOrder();

        order.addItem("Pizza", 200, 2);
        order.addItem("Burger", 120, 1);

        assertEquals(520.0, order.calculateTotal());
    }

    @Test
    void testAddSingleItem() {
        FoodOrder order = new FoodOrder();

        order.addItem("Pizza", 200, 1);

        assertEquals(200.0, order.calculateTotal());
    }

    @Test
    void testApplyDiscount() {
        FoodOrder order = new FoodOrder();

        order.addItem("Pizza", 200, 2);

        assertEquals(360.0, order.applyDiscount(10));
    }

    @Test
    void testCalculateDeliveryFee() {
        FoodOrder order = new FoodOrder();

        assertEquals(30.0, order.calculateDeliveryFee(3));
        assertEquals(80.0, order.calculateDeliveryFee(10));
    }

    @Test
    void testInvalidQuantity() {
        FoodOrder order = new FoodOrder();

        assertThrows(
                IllegalArgumentException.class,
                () -> order.addItem("Pizza", 200, 0)
        );
    }
}