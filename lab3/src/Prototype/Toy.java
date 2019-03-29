package Prototype;

public class Toy implements Copyable {
    protected String type;
    protected String material;

    public Toy(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toy {" +
                "type='" + type + '\'' +   '}';
    }

    @Override
    public Object copy() {
        return new Toy(type);
    }

}
