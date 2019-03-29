package task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) throws ParseException {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);


        // creating offender data
        Date time_of_crime = simpleDateFormat.parse("2018-09-09");
        Date deadline = simpleDateFormat.parse("2019-01-09");

        List<String> reasons = new ArrayList<>(2);
        reasons.add("stealing");
        reasons.add("attempted murder");



        Offender offender = new Offender("Gatsby", "Big", time_of_crime, reasons, deadline);

        IPolice police = new ProxyPolice();
        police.createProfile(offender);

    }
}
