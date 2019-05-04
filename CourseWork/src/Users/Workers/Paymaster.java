package Users.Workers;

import Users.Worker;

public class Сashier extends Worker implements IWork {
    public Сashier(String fullname, String sex) {
        super(fullname, sex, "cashier");
    }

    @Override
    public void work() {

    }
}
