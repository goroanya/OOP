package Users;

public  abstract  class User {
    protected String fullname;
    protected String sex;
    protected int age;


    public User(String fullname, String sex) {
        this.fullname = fullname;
        this.sex = sex;
    }

    public String getFullname() {
        return fullname;
    }
}
