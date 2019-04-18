package Users.Workers;

import Users.Worker;

public class Manager extends Worker implements IWork {

    public Manager(String fullname, String sex, String position, String secretCode) {
        super(fullname, sex, position, secretCode);
    }

    @Override
    public void work() {

    }
}
