package task2;

public class AbstractPassenger {
    IPassenger pass;

    public AbstractPassenger(IPassenger p) {
        this.pass = p;
    }

    public boolean payForTransit() {
        return this.pass.payForTransit();
    }
}
