package Discount;

import Products.Product;
import Users.Worker;

public class SimpleDiscountSystem implements IDiscount {

    @Override
    public void setDiscount(Product product, Worker worker, int value) {
        if (value >= 0 && value <= product.getPrice()) {
            worker.setDiscount(product, value);
        }
    }
}
