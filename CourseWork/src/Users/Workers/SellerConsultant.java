package Users.Workers;

import Users.Worker;

public class SellerConsultant extends Worker implements IWork {

    public SellerConsultant(String fullname, String sex, String position, String secretCode) {
        super(fullname, sex, position, secretCode);
    }

    @Override
    public void work() {

    }
}
