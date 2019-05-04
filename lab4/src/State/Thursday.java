package State;

public class Thursday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Thursday : Medicine #1 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Thursday : Medicine #4 is used in the evening...");
    }
}
