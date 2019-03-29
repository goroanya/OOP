package task1;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Offender {
    private String firstName;
    private String lastName;
    private Date time_of_crime;
    private List<String> reasons;
    private Date deadline;




    public Offender(String firstName, String lastName, Date time_of_crime, List<String> reasons, Date deadline) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.time_of_crime = time_of_crime;
        this.reasons = reasons;
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    protected void getProfile() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println( Colors.ANSI_YELLOW + "    Offender profile" + Colors.ANSI_RESET);
        System.out.println("Last name : " + lastName);
        System.out.println("First name : " + firstName);
        System.out.print("Reasons to be detained : ");
        for (String reason : reasons) {
            System.out.print("  " + reason);
        }
        System.out.println("\nDate of crime : " + format.format(time_of_crime));
        System.out.println("Date of freedom : " + format.format(deadline));

    }
}
