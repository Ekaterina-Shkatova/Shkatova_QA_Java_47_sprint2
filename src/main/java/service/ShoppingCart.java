package service;

import model.Food;

public class ShoppingCart {

    Food[] arrFood;

    public ShoppingCart(Food[] arrFood) {
        this.arrFood = arrFood;
    }

    public float getCartPrice() {
        float cartPrice = 0;
        for (int i = 0; i < arrFood.length; i++) {
            cartPrice = cartPrice + arrFood[i].amount * arrFood[i].price;
        }
        return cartPrice;
    }

    public float getCartPriceDiscounted() {
        float priceDiscounted = 0;
        for (int i = 0; i < arrFood.length; i++) {
            float discount = arrFood[i].getDiscount();
            priceDiscounted = priceDiscounted + arrFood[i].amount * arrFood[i].price * (1 - discount/100);
        }
        return priceDiscounted;
    }

    public float getCartPriceVeg() {
        float price = 0;
        for (int i = 0; i < arrFood.length; i++) {
            if (arrFood[i].isVegeterian) {
                price = price + arrFood[i].amount * arrFood[i].price;
            }
        }
        return price;
    }
}
