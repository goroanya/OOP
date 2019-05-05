package Users;

import Products.Product;

public class Worker extends User {

    private String position;

    public Worker(String fullname, String sex, String position) {
        super(fullname, sex);
        this.position = position;
        this.type = UserType.WORKER;
    }

    public String getPosition() {
        return position;
    }

    public void setDiscount(Product p, int value) {
        p.setDiscount(value);
    }

}
