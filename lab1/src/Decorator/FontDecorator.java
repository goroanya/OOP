package Decorator;

public class FontDecorator extends Decorator {

    protected String _font;

    public FontDecorator(String font) {
        this._font = font;
    }

    public void send() {
        super.send();
        System.out.print(" | with  changed font : " + _font );
    }
}

