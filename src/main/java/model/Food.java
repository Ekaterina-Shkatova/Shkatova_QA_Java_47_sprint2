package model;

interface Discountable {
    public int getDiscount();
}

public class Food implements Discountable{
    public int amount;
    public float price;
    public boolean isVegeterian;

    public static void main(String[] args){
    }

    @Override
    public int getDiscount() {
        return 0;
    }

    public class Meat extends Food {

        public Meat(int amount, float price) {
            super.amount = amount;
            super.price = price;
            super.isVegeterian = false;
        }

    }

    public class Apple extends Food implements Discountable{

        private String colour;

        public Apple(int amount, float price, String Colour) {
            super.amount = amount;
            super.price = price;
            this.colour = colour;
            super.isVegeterian = true;
        }

        @Override
        public int getDiscount() {
            return 60;
        }
    }
}



