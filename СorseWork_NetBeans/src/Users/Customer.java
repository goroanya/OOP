package Users;

import Delivery.DeliveryManager;
import Delivery.DeliveryManager.ShippingType;
import Payment.*;
import Products.Product;

import java.util.HashMap;

public class Customer extends User {

    private CustomerPayment paymentType;

    private float money;
    private int allProductsCost;
    private int shippingCost;

    public HashMap<Product, Integer> basket = new HashMap<>();

    public Customer(String fullname, String sex, float money) {
        super(fullname, sex);
        this.paymentType = new CustomerPayment(new CashPayment());
        this.money = money;
        this.type = UserType.CUSTOMER;
    }

    public Customer(int age, String fullname, String sex) {
        super(fullname, sex, age);
        this.money = 50000;
        this.type = UserType.CUSTOMER;
        this.paymentType = new CustomerPayment(new CashPayment());

    }

    public float getMoney() {
        return this.money;
    }

    public int getAllProductsCost() {
        if (allProductsCost == 0) {
            basket.keySet().forEach((Product key) -> {
                this.allProductsCost += key.getCurrentPrice() * basket.get(key);
            });
        }
        return this.allProductsCost;
    }

    public void setBasket(HashMap<Product, Integer> b) {
        this.basket = b;
        this.allProductsCost = 0;
    }

    public void setCustomerPayment(CustomerPayment p) {
        this.paymentType = p;
    }

    public int getTotalCost() {
        return this.allProductsCost + this.shippingCost;
    }

    public boolean payForProducts() {
        float toPay = paymentType.pay(getTotalCost());
        if (money >= toPay) {
            money -= toPay;
            System.out.println("Your balance decreased by " + (int) toPay);
            return true;
        } else {
            return false;
        }
    }

    public void addShippingCost(int cost) {
        this.shippingCost += cost;
    }

    public void removeShippingCost() {
        this.shippingCost = 0;
    }

    public boolean hasMoneyToPay(ShippingType type) {
        return money >= paymentType.pay(getAllProductsCost() + DeliveryManager.getShippingCost(type));
    }

}
