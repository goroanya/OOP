package AbstractFactory.Korea;

import AbstractFactory.Computer;
import AbstractFactory.CountryFactory;
import AbstractFactory.TVSet;

public class KoreanFactory implements CountryFactory {
    @Override
    public TVSet getTVSet() {
        return new SamsungTVSet();
    }

    @Override
    public Computer getComputer() {
        return new VingaComputer();
    }

}
