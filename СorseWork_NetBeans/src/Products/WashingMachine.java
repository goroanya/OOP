package Products;

public class WashingMachine extends Product implements IProduct, Copyable {

    // no discount
    private int capacity;

    public WashingMachine(Color color, String name, int price, String manufacturer, int capacity) {
        super(color, name, price, manufacturer);
        this.capacity = capacity;
    }


    @Override
    public int getCurrentPrice() {
        return this.price;
    }


    @Override
    public Product copy() {
        return new WashingMachine(this.color, this.name, this.price, this.manufacturer, this.capacity);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        WashingMachine that = (WashingMachine) object;
        return capacity == that.capacity;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), capacity);
    }
}
