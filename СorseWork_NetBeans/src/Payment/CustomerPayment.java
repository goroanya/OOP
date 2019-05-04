package Payment;
// Implementor for a "bridge" design pattern.

public class CustomerPayment {

    ICustomerPayForProduct paymentType;

    public CustomerPayment(ICustomerPayForProduct paymentType) {
        this.paymentType = paymentType;
    }

    public void setPaymentType(ICustomerPayForProduct paymentType) {
        this.paymentType = paymentType;
    }

    public float pay(int toPay) {
        return this.paymentType.payForProducts(toPay);
    }

}
