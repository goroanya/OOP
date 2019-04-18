package Users.Workers;

import Users.Worker;

public class Сashier extends Worker implements IWork {
    public Сashier(String fullname, String sex, String position, String secretCode) {
        super(fullname, sex, position, secretCode);
    }

    @Override
    public void work() {

    }
}
