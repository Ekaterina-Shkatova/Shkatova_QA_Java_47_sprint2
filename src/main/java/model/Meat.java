package model;

import model.constants.Discount;

public class Meat extends Food {

    public Meat(int amount, float price) {
        super.amount = amount;
        super.price = price;
        super.isVegeterian = false;
    }

    @Override
    public float getDiscount() {
        return Discount.DISCOUNT;
    }

}
