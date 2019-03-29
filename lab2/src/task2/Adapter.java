package task2;

public class Adapter extends AbstractPassenger {

    private Tourniquet _tourniquet = new Tourniquet();

    public Adapter(IPassenger p) {
        super(p);
    }

    @Override
    public boolean payForTransit() {
        boolean resultOfPayment = super.payForTransit();
        return _tourniquet.givePermission(resultOfPayment);
    }
}
