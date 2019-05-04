
package Products;

public class Fridge extends Product implements IProduct, Copyable {

    private boolean hasFreezer;

    public Fridge(Color color,String name, int price, String manufacturer, boolean hasFreezer) {
        super(color, name, price, manufacturer);
        this.hasFreezer = hasFreezer;
        this.discount = 0;
    }
    private Fridge(Color color,String name, int price, String manufacturer, boolean hasFreezer, int discount) {
        super(color, name, price, manufacturer);
        this.hasFreezer = hasFreezer;
        this.discount = discount;
    }

    @Override
    public int getCurrentPrice() {
        return hasFreezer  ? (this.price - discount + 1000) : (this.price - discount);
    }
    

    @Override
    public Product copy() {
        return new Fridge(this.color, this.name, this.price, this.manufacturer, this.hasFreezer, this.discount);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Fridge fridge = (Fridge) object;
        return hasFreezer == fridge.hasFreezer &&
                discount == fridge.discount;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), hasFreezer, discount);
    }
}