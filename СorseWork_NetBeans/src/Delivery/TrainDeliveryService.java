package Delivery;

import Users.Customer;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class TrainDeliveryService extends Decorator {

    private final int shippingCost = 500;

    @Override
    public void deliverProducts(Customer customer) {
        customer.addShippingCost(shippingCost);
        super.deliverProducts(customer);
        JOptionPane.showMessageDialog(
                    new Frame("Order"),
                    "Your is arriving by train,please wait. Thanks for choosing our shop.\nBest wishes.",
                    "Order is ready",
                    JOptionPane.INFORMATION_MESSAGE);

    }
}
