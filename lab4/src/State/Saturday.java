package State;

public class Saturday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Saturday : Medicine #3 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Saturday : Medicine #4 is used in the evening...");
    }
}
