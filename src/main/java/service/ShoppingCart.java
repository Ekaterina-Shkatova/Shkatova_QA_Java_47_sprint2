package service;

import model.Food;
import model.constants.Discount;

public class ShoppingCart {

    Food[] arrFood;

    public ShoppingCart(Food[] arrFood) {
        this.arrFood = arrFood;
    }

    public float getCartPrice() {
        float cartPrice = 0;
        for (int i = 0; i < arrFood.length; i++) {
            cartPrice = cartPrice + arrFood[i].price;
        }
        return cartPrice;
    }

    public float getCartPriceDiscounted() {
        float PriceDiscounted = 0;
        Discount discount = new Discount();
        for (int i = 0; i < arrFood.length; i++) {
            discount.discount = (float) arrFood[i].getDiscount();
            PriceDiscounted = PriceDiscounted + arrFood[i].price * (1 - discount.discount/100);
        }
        return PriceDiscounted;
    }

    public float getCartPriceVeg() {
        float Price = 0;
        for (int i = 0; i < arrFood.length; i++) {
            if (arrFood[i].isVegeterian) {
                Price = Price + arrFood[i].price;
            }
        }
        return Price;
    }



}
