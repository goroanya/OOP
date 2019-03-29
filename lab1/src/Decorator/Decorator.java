package Decorator;

public class Decorator extends Message {
    protected Message MS;

    public void addFeature(Message mes) {
        this.MS = mes;
    }

    public void send() {
        if (MS != null)
            MS.send();
    }
}
