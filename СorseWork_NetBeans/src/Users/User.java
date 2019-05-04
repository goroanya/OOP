package Users;


public  abstract  class User {
    protected UserType type;
    private String fullname;
    private String sex;
    private int age;


    public User(String fullname, String sex) {
        this.fullname = fullname;
        this.sex = sex;
    }
    public User(String fullname,String sex, int age){
        this.fullname = fullname;
        this.sex = sex;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
    public UserType getType() {
        return type;
    }
    
}
