package State;

import Users.UserType;
import java.util.HashMap;

public   class StateFactory {
    static HashMap<UserType,State> states = new HashMap<>();
    static{
        
        states.put(UserType.CUSTOMER, null);
        states.put(UserType.WORKER, null);

    }
    public State getState(UserType type){
        if(states.get(type) == null ){
            if(type == UserType.CUSTOMER){
                states.put(type, new CustomerState());
            }
            else{
               states.put(type, new WorkerState());
            }
        }
        return states.get(type);
    }
    
}
