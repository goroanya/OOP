package Decorator;

public class SizeDecorator extends Decorator {

    protected int _size;

    public SizeDecorator(int size) {
        this._size = size;
    }

    @Override
    public void send() {
        super.send();
        System.out.print(" | with changed size : " + _size );

    }



}
