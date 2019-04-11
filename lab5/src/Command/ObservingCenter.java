package Command;

public class ObservingCenter {

    public void startMorningMonitoring(Command command) {
        Timer.setTimeout(() -> command.execute(), 2000);
    }

    public void startEveningMonitoring(Command command) {
        Timer.setTimeout(() -> command.execute(), 4000);

    }
}
