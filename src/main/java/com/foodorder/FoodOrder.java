package com.foodorder;

import java.util.ArrayList;
import java.util.List;

public class FoodOrder {

    private final List<Double> itemTotals = new ArrayList<>();

    // Method 1: Add a food item to the order
    public void addItem(String itemName, double price, int quantity) {

        if (price < 0 || quantity <= 0) {
            throw new IllegalArgumentException("Invalid price or quantity");
        }

        itemTotals.add(price * quantity);
    }

    // Method 2: Calculate the total order amount
    public double calculateTotal() {

        double total = 0;

        for (double itemTotal : itemTotals) {
            total += itemTotal;
        }

        return total;
    }

    // Method 3: Apply a percentage discount
    public double applyDiscount(double discountPercentage) {

        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Invalid discount percentage");
        }

        double total = calculateTotal();

        return total - (total * discountPercentage / 100);
    }

    // Method 4: Calculate delivery fee
    public double calculateDeliveryFee(double distanceInKm) {

        if (distanceInKm < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }

        if (distanceInKm <= 5) {
            return 30.0;
        } else {
            return 30.0 + ((distanceInKm - 5) * 10);
        }
    }
}