package Users;

public class Worker extends User {

    private  String position;

    public Worker(String fullname, String sex, String position ) {
        super(fullname, sex);
        this.position = position;
    }

}
