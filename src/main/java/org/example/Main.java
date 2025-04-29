package org.example;

import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {

        String redColor = Colour.colourRed;
        String greenColor = Colour.colourGreen;

        Food food = new Food();
        Food.Meat meat = food.new Meat(5, 100);
        Food.Apple appleRed = food.new Apple(10, 50, redColor);
        Food.Apple appleGreen = food.new Apple(8, 60, greenColor);

        Food[] arrFood = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(arrFood);

        System.out.println(shoppingCart.getCartPrice());
        System.out.println(shoppingCart.getCartPriceDiscounted());
        System.out.println(shoppingCart.getCartPriceVeg());

    }
}