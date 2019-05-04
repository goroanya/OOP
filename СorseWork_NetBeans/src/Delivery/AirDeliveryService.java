package Delivery;

import Users.Customer;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class AirDeliveryService extends Decorator {

    private final int shippingCost = 1000;

    @Override
    public void deliverProducts(Customer customer) {
        customer.addShippingCost(shippingCost);
        super.deliverProducts(customer);
        JOptionPane.showMessageDialog(
                    new Frame("Order"),
                    "Your is arriving by air,please wait. Thanks for choosing our shop.\nBest wishes.",
                    "Order is ready",
                    JOptionPane.INFORMATION_MESSAGE);

    }
}
