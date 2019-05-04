package Discount;

import Products.Product;
import Users.Worker;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class ProtectedDiscountSystem implements IDiscount {

    private SimpleDiscountSystem basic = new SimpleDiscountSystem();

    @Override
    public void setDiscount(Product p, Worker w, int value) {
        // ONLY manager can set doscount more than a half of price of product 
        if (value >= p.getPrice() / 2) {
            if (!"manager".equals(w.getPosition().toLowerCase())) {

                JOptionPane.showMessageDialog(
                        new Frame("Exceeding the value of the discount"),
                        "Sory, you cant set discount value more than a half of product price.Only manager can do it.",
                        "Exceeding the value of the discount",
                        JOptionPane.WARNING_MESSAGE);

            } else {
                basic.setDiscount(p, w, value);
            }
        } else {
            basic.setDiscount(p, w, value);
        }

    }

}
