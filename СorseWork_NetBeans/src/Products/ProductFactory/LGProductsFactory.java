package Products.ProductFactory;

import Discount.ProtectedDiscountSystem;
import Products.*;
import static Products.Color.*;
import Users.Worker;

    public class LGProductsFactory implements IProductFactory {

    private ProtectedDiscountSystem discountSystem = new ProtectedDiscountSystem();

    private WashingMachine wash;
    private TVSet tv;
    private Fridge fridge;

    public LGProductsFactory() {
        this.wash = new WashingMachine(RED, "LG WW6WIH2109SDUA", 4000, "lg", 30);
        this.tv = new TVSet(BLACK, "LG KGYVIK57C", 5000, "lg", 90);
        this.fridge = new Fridge(WHITE, "LG MLKcRT6467", 20000, "lg", false);
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
