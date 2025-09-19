package model;
import model.constants.Discount;

public class Meat extends  Food {
    public  Meat(int amount, double price){
        super(amount,price, false);
    }

    @Override
    public boolean isVegetarian()
    {
        return false;
    }

    @Override
    public double  getDiscount() {
        return Discount.COMMON_DISCOUNT;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }


}
