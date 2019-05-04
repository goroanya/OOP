package Products.ProductFactory;

import Discount.ProtectedDiscountSystem;
import Products.*;
import static Products.Color.GREEN;
import Users.Worker;

public class SamsungProductsFactory implements IProductFactory {

    private ProtectedDiscountSystem discountSystem = new ProtectedDiscountSystem();

    private WashingMachine wash;
    private TVSet tv;
    private Fridge fridge;

    public SamsungProductsFactory() {
        this.wash = new WashingMachine(GREEN, "Samsung VKCUTF46VJ", 5000, "samsung", 5);
        this.tv = new TVSet(GREEN, "Samsung 177VJCuDYCDX", 15000, "samsung", 120);
        this.fridge = new Fridge(GREEN, "Samsung LNLIDGB42343", 20000, "samsung", true);
    }

    @Override
    public WashingMachine getWashingMachine() {
        return (WashingMachine) wash.copy();
    }

    @Override
    public Fridge getFridge() {
        return (Fridge) fridge.copy();
    }

    @Override
    public TVSet getTVSet() {
        return (TVSet) tv.copy();
    }

    @Override
    public int setTVDiscount(int value, Worker w) {
        this.discountSystem.setDiscount(tv, w, value);
        return this.tv.getDiscount();
    }

    @Override
    public int setFridgeDiscount(int value, Worker w) {
        this.discountSystem.setDiscount(fridge, w, value);
        return this.fridge.getDiscount();

    }

}
