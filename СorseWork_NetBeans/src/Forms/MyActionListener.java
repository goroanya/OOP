package Forms;

import Products.ProductType;
import Users.Worker;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyActionListener implements ActionListener {

    private JTextField textField;
    private SignInWindow parentWindow;
    private ProductType type;

    public MyActionListener(JTextField field, SignInWindow parent, ProductType type) {
        this.textField = field;
        this.parentWindow = parent;
        this.type = type;
    }

    public void actionPerformed(ActionEvent e) {
        int value = parseDiscountField(this.textField);
        int discount = setDiscountToFactoryProduct(value);
        textField.setText("" + discount);

    }

    private int setDiscountToFactoryProduct(int value) {

        switch (type) {
            case LG_TV: {
                return this.parentWindow.lgFactory.setTVDiscount(value, (Worker) parentWindow.getUser());
            }
            case LG_FRIDGE: {
                return this.parentWindow.lgFactory.setFridgeDiscount(value, (Worker) parentWindow.getUser());
            }
            case SAMSUNG_TV: {
                return this.parentWindow.samsungFactory.setTVDiscount(value, (Worker) parentWindow.getUser());
            }
            case SAMSUNG_FRIDGE: {
                return this.parentWindow.samsungFactory.setFridgeDiscount(value, (Worker) parentWindow.getUser());
            }
            case SATURN_TV: {
               return  this.parentWindow.saturnFactory.setTVDiscount(value, (Worker) parentWindow.getUser());
            }
            case SATURN_FRIDGE: {
                return this.parentWindow.saturnFactory.setFridgeDiscount(value, (Worker) parentWindow.getUser());
            }
            default: {
                throw new RuntimeException("Unknown product type");
            }

        }
    }

    private int parseDiscountField(JTextField field) {
        int discount = 0;

        try {
            discount = parseInt(field.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    new Frame("Uncorrect value"),
                    "Fill the correct value of discount!!",
                    "Uncorrect value",
                    JOptionPane.ERROR_MESSAGE);
            field.setText("");
        }
        return discount;
    }
}
