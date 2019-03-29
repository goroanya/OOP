package Prototype;

public class Candy implements Copyable {
    protected String type;

    public Candy(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy {" +
                "type='" + type + '\'' + '}';
    }

    @Override
    public Object copy() {
        return new Candy(type);
    }
}
