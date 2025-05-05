package model;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, float price, String colour) {
        super.amount = amount;
        super.price = price;
        this.colour = colour;
        super.isVegeterian = true;
    }

    @Override
    public float getDiscount() {
        return 60;
    }
}
