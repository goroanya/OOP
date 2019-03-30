package State;

public class Main {
    public static void main(String[] args) {
        Patient person = new Patient();

        person.setDay(new Sunday());
        person.takeDrugs();

        person.changeDay();

        person.takeDrugs();
    }
}
