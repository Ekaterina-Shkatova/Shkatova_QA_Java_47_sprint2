package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {

    private String colour;

    public Apple(int amount, float price, String colour) {
        super.amount = amount;
        super.price = price;
        this.colour = colour;
        super.isVegeterian = true;
    }

    @Override
    public float getDiscount() {
        if (this.colour.equals(Colour.COLOUR_RED)) {
            return Discount.DISCOUNT_60;
        } else {
            return Discount.DISCOUNT;
        }
    }
}
