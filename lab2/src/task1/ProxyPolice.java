package task1;

import java.util.Date;

public class ProxyPolice extends Police {

    private Police police = new Police();

    @Override
    public void createProfile(Offender offender) {

        if (offender.getDeadline().before(new Date())) {

            police.createProfile(offender);
            System.out.println(Colors.ANSI_RED + "Offender's deadline has already come, get him out!" + Colors.ANSI_RESET);

        } else {
            police.createProfile(offender);
        }
    }
}
