package AbstractFactory.China;

import AbstractFactory.Computer;
import AbstractFactory.CountryFactory;
import AbstractFactory.TVSet;

public class ChineseFactory implements CountryFactory {

    @Override
    public TVSet getTVSet() {
        return new HisenseTVSet();
    }

    @Override
    public Computer getComputer() {
        return new LenovoComputer();
    }
}
