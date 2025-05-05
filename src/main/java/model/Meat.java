package model;

public class Meat extends Food {

    public Meat(int amount, float price) {
        super.amount = amount;
        super.price = price;
        super.isVegeterian = false;
    }

}
