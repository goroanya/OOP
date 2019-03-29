package AbstractFactory;

import AbstractFactory.China.ChineseFactory;
import AbstractFactory.Korea.KoreanFactory;

public class Main {
    public static void main(String[] args) {

        //Chinese factory
        CountryFactory china = new ChineseFactory();

        //Lenovo computer and Hisense TV set
        Computer chineseComputer = china.getComputer();
        System.out.println(chineseComputer.toString());

        TVSet chineseTV = china.getTVSet();
        System.out.println(chineseTV.toString());

        System.out.println("\n");

        //Korean factory
        CountryFactory korea = new KoreanFactory();

        Computer koreanComputer = korea.getComputer();
        System.out.println(koreanComputer.toString());

        TVSet koreanTV = korea.getTVSet();
        System.out.println(koreanTV.toString());

        //collection of specified country
        VirtualCollection collection;

        collection = new VirtualCollection(china);
        System.out.println("\nChina : ");
        collection.checkPerformance();


        collection = new VirtualCollection(korea);
        System.out.println("\nKorea : ");
        collection.checkPerformance();
    }
}
