package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;
    private int money;
    private String position;

    private List<Component> _children = new ArrayList<Component>();

    public Composite(String position, String name) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void add(Component component) {
        _children.add(component);
    }

    @Override
    public int getMoney() {
        this.money = 0;
        for (Component component : _children) {
            this.money += component.getMoney();
        }
        return this.money;
    }

    @Override
    public String getName() {
        return this.name;
    }
}


