package State;

public class Friday implements IDay {
    @Override
    public void takeMorningGrugs() {
        System.out.println("Friday : Medicine #2 is used in the morning...");
    }

    @Override
    public void takeEveningGrugs() {
        System.out.println("Friday : Medicine #4 is used in the evening...");
    }
}
