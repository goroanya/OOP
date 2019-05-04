package Delivery;

import Users.Customer;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class BasicDeliveryService extends DeliveryService {

    @Override
    public void deliverProducts(Customer customer) {
        boolean hasEnoughMoney = customer.payForProducts();

        if (!hasEnoughMoney) {
            JOptionPane.showMessageDialog(
                    new Frame("Failed order"),
                    "You don't have enough money to get this order",
                    "Unsuccessful order",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(
                    new Frame("Order"),
                    "Your order is ready.",
                    "Order is ready",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
