
package DB;
import Users.*;
import java.util.HashMap;


public class UsersDataBase {
    static HashMap<String,User> users = new HashMap<>();
    static{ 
        users.put("goroanya", new Customer("Horodchenko Anna","female", 100000));
        users.put("traumgedanken", new Customer("Bulaievskiy Ihor","male", 20000));
        
        users.put("ariana", new Worker("Grande Ariana","female", "cashier" ));
        users.put("taylor", new Worker("Swift Taylor","female", "seller-consultant" ));
        users.put("weekend", new Worker("Abęl  Tesfaye;","male", "manager" ));
    }
    public User getUser(String login){
        return users.get(login);
    }
}
