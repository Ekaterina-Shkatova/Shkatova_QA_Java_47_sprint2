package model;

import model.constants.Discount;

public class Food implements Discountable{
    public int amount;
    public float price;
    public boolean isVegeterian;

    public static void main(String[] args){
    }

    @Override
    public float getDiscount() {
        return Discount.DISCOUNT;
    }

}



