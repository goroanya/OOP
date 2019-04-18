package Data;

import Users.Worker;

import java.util.Hashtable;

public class Workers {
    private Hashtable<String,Worker> workers = new Hashtable<>();

    public  void addWorkers(){
        if(workers.size() == 0 ){
            workers.put("bcms1",new Worker("BrentonCrosbie", "male","seller-consultant"));
            workers.put("tvfc2",new Worker("TeenaVolz", "female","cashier"));
            workers.put("rdmc3",new Worker("ReinaldoDaggett", "male","cashier"));
            workers.put("slmm4",new Worker("StacyLanphear", "male","manager"));
            workers.put("nbfs5", new Worker("NidiaBurrier", "female","seller-consultant"));
        }
    }
    public Worker getWorker(String secret){
        return workers.get(secret);
    }
    public boolean containWorker(Worker w){
        return workers.containsValue(w);
    }
}
