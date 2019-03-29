package task2;

import task1.Colors;

public class Tourniquet {

    public boolean givePermission(boolean payment) {
        if (payment) {
            System.out.println("Signal from tourniquet : " + Colors.ANSI_GREEN + "Allowed" + Colors.ANSI_RESET);
            return true;
        } else {
            System.out.println("Signal from tourniquet : " + Colors.ANSI_RED + "Forbidden" + Colors.ANSI_RESET);
            return false;
        }

    }
}
