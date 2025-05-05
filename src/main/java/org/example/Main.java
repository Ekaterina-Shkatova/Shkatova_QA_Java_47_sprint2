package org.example;

import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {

        String redColor = Colour.COLOUR_RED;
        String greenColor = Colour.COLOUR_GREEN;

        Food food = new Food();
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, redColor);
        Food appleGreen = new Apple(8, 60, greenColor);

        Food[] arrFood = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(arrFood);

        System.out.println(shoppingCart.getCartPrice());
        System.out.println(shoppingCart.getCartPriceDiscounted());
        System.out.println(shoppingCart.getCartPriceVeg());

    }
}