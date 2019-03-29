package Decorator;

public class Main2 {
    public static void main(String[] args) {

        Message defaultMessage = new DefaultMessage("\"THE BEST MESSAGE AAAAA\"");

        Decorator dSize = new SizeDecorator(11);
        Decorator dColor = new ColorDecorator("blue");
        Decorator dFont = new FontDecorator("Serif");

        dFont.addFeature(defaultMessage);
        dSize.addFeature(defaultMessage);
        dColor.addFeature(dSize);

        dColor.send();
        dSize.send();


        Message defaultMessage2 = new DefaultMessage("\"Hello world!\"");

        Decorator dSize2 = new SizeDecorator(36);
        Decorator dColor2 = new ColorDecorator("white");
        Decorator dFont2 = new FontDecorator("Colibri");

        dColor2.addFeature(defaultMessage2);
        dSize2.addFeature(dColor2);
        dFont2.addFeature(dSize2);
        dFont2.send();


    }
}


