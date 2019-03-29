package Decorator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DefaultMessage extends Message {
    protected String text;
    protected String font;
    protected int size;
    protected String color;

    public DefaultMessage(String text) {
        this.text = text;
        this.color = "black";
        this.font = "Times New Roman";
        this.size = 14;
    }

    public void send() {
        System.out.print("\nMessage:   " + this.text + " was sent  at " );
        System.out.print( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss  ").format(Calendar.getInstance().getTime()) );

    }
}
