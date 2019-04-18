package Users;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private int money;
    public int allProductsCost;
    private List<Product> basket = new ArrayList<>();


    public Customer(String fullname, String sex, int money) {
        super(fullname, sex);
        this.money = money;
    }

    public void addProduct(Product p){
        basket.add(p);
        allProductsCost += p.getPrice();
    }
    public void removeProduct(Product p){
        basket.remove(p);
        allProductsCost -= p.getPrice();
    }
    public void emptyBasket(){
        basket.clear();
    }

}
