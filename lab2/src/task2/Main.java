package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AbstractPassenger cardPassenger = new Adapter(new CardPassenger(5));
        cardPassenger.payForTransit();

        AbstractPassenger cardPassenger2 = new Adapter(new CardPassenger(400));
        cardPassenger2.payForTransit();

        AbstractPassenger tokenPassenger = new Adapter(new TokenPassenger(new ArrayList<>(0)));
        tokenPassenger.payForTransit();

        AbstractPassenger tokenPassenger2 = new Adapter(new TokenPassenger());
        tokenPassenger2.payForTransit();

    }
}
