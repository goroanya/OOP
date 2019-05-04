package Products.ProductFactory;

import Discount.ProtectedDiscountSystem;
import Products.*;
import static Products.Color.*;
import Users.Worker;

public class SaturnProductsFactory implements IProductFactory {

    private ProtectedDiscountSystem discountSystem = new ProtectedDiscountSystem();

    private WashingMachine wash;
    private TVSet tv;
    private Fridge fridge;

    public SaturnProductsFactory() {
        this.wash = new WashingMachine(WHITE, "SATURN ST-WK7602", 23000, "saturn", 10);
        this.tv = new TVSet(WHITE, "SATURN ST-BBIYF68", 30000, "saturn", 150);
        this.fridge = new Fridge(BLACK, "SATURN ST-WKGIP", 10000, "saturn", false);
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
