package State;

public class Friday implements IDay {
    @Override
    public void takeMorningDrugs() {
        System.out.println("Friday : Medicine #2 is used in the morning...");
    }

    @Override
    public void takeEveningDrugs() {
        System.out.println("Friday : Medicine #4 is used in the evening...");
    }
}
