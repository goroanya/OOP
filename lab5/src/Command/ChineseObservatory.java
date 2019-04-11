package Command;

public class ChineseObservatory implements  Observatory {
    @Override
    public void observe(String star) {
        System.out.println("Chinese Observatory is observing " + star.toUpperCase());

    }
}
