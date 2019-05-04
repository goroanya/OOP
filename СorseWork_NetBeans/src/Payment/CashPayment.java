package Payment;
// Second concrete abstraction - paying with cash.
public class CashPayment  implements ICustomerPayForProduct{

    @Override
    // Regular payment without cashback.
    public float payForProducts(int toPay) {
        return toPay;
    }
    
}
