package Command;

public class UkrainianObservatory  implements Observatory{
    @Override
    public void observe(String star) {
        System.out.println("Ukrainian Observatory is observing " + star.toUpperCase());
    }
}
