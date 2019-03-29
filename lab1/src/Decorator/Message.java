package Decorator;

abstract class Message {
    protected String text;
    protected String font;
    protected int size;
    protected String color;

    public abstract void send();

}
