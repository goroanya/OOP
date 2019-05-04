package Payment;

// First concrete abstraction - paying with credit card.
public class CardPayment implements ICustomerPayForProduct {

    @Override
    // Get a 10% cashback as a card credit card owner.
    public float payForProducts(int toPay) {
        return (float) (toPay * 0.9);
    }
    
}
