package Command;

public class Main {
    public static void main(String[] args) {
        ObservingCenter observingCenter = new ObservingCenter();

        ChineseObservatory chineseObservatory = new ChineseObservatory();
        UkrainianObservatory ukrainianObservatory = new UkrainianObservatory();

        System.out.println("Morning: ");
        observingCenter.startMorningMonitoring( new ObserveStarCommand("Sirius", ukrainianObservatory));

        observingCenter.startEveningMonitoring( new ObserveStarCommand("Sirius", chineseObservatory));
        Timer.setTimeout(()-> System.out.println("Afternoon: "), 3000);

    }
}
