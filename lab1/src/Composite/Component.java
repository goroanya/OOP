package Composite;

public interface Component {
    void add(Component component);
    int getMoney();
    String getName();
}
