/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
