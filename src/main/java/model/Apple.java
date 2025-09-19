package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (this.colour.equals(Colour.RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        else {
            return Discount.COMMON_DISCOUNT;
        }
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian()
    {
        return true;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }
}