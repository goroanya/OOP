package Products;

public class TVSet extends Product implements  Copyable {

    private int diagonal;

    public TVSet(Color color, String name, int price, String manufacturer, int diagonal) {
        super(color, name, price, manufacturer);
        this.diagonal = diagonal;
        this.discount = 0;
    }

    public TVSet(Color color, String name, int price, String manufacturer, int diagonal, int discount) {
        super(color, name, price, manufacturer);
        this.diagonal = diagonal;
        this.discount = discount;
    }


    @Override
    public int getCurrentPrice() {
        return diagonal >= 100 ? (this.price - discount + 500) : (this.price - discount);
    }


    @Override
    public Product copy() {
        return new TVSet(this.color, this.name, this.price, this.manufacturer, this.diagonal, this.discount);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        TVSet tvSet = (TVSet) object;
        return diagonal == tvSet.diagonal &&
                discount == tvSet.discount;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), diagonal, discount);
    }

  
}
