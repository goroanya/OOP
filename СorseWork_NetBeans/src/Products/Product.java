package Products;

public abstract class Product implements IProduct {

    protected int price;
    protected int discount;
    protected String manufacturer;
    protected String name;
    protected Color color;

    public int getPrice() {
        return this.price;
    }

    @Override
    public int getCurrentPrice() {
        return this.price - this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return this.discount;
    }

    public Product(Color color, String name, int price, String manufacturer) {
        this.color = color;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Product product = (Product) object;
        return price == product.price
                && manufacturer.equals(product.manufacturer)
                && name.equals(product.name)
                && color.equals(product.color);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.getClass(), price, manufacturer, name, color);
    }

}
