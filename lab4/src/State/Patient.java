package State;

public class Patient {
    private IDay day;

    public void setDay(IDay day) {
        this.day = day;
    }

    public void changeDay() {
        if (day instanceof Monday) setDay(new Tuesday());
        else if (day instanceof Tuesday) setDay(new Wednesday());
        else if (day instanceof Wednesday) setDay(new Thursday());
        else if (day instanceof Thursday) setDay(new Friday());
        else if (day instanceof Friday) setDay(new Saturday());
        else if (day instanceof Saturday) setDay(new Sunday());
        else setDay(new Monday());
    }
    public void takeDrugs(){
        day.takeMorningDrugs();
        day.takeEveningDrugs();
    }

}
