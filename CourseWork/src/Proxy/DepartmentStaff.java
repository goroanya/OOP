package Proxy;

import Data.Workers;
import Users.Worker;

public class DepartmentStaff extends Establishment {

    private Establishment shop = new Establishment();
    private Workers workers = new Workers();

    public DepartmentStaff() {
        workers.addWorkers();
    }

    @Override
    public boolean getPermission(String secret) {
        return shop.getPermission(secret) &&  workers.getWorker(secret) != null;
    }

    public Worker getWorker(String secret){
        return workers.getWorker(secret);
    }
}
