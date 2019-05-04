package Delivery;

import Users.Customer;

public class Decorator extends DeliveryService {
    
    protected DeliveryService delivery;
    
    public void addShippingRoute(DeliveryService delivery) {
        this.delivery = delivery;
    }
    
    @Override
    public void deliverProducts(Customer customer) {
        if (delivery != null) {
            delivery.deliverProducts(customer);
        }
    }
    
}
