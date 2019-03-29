package Decorator;

public class ColorDecorator extends Decorator {

    protected String _color;

    public ColorDecorator(String color) {
        this._color = color;
    }

    public void send() {
        super.send();
        System.out.print(" | with  changed color : " + _color );
    }
}
