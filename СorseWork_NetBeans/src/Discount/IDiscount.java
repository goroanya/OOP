package Discount;

import Products.Product;
import Users.Worker;

interface IDiscount {
    void setDiscount(Product p, Worker w, int value);
}
