package Strategy;


public class Main {
    public static void main(String[] args) {
        Agency agency = new Agency();

        agency.setPerson(new Official());
        agency.servePerson();

        agency.setPerson(new Child());
        agency.servePerson();

        agency.setPerson(new Entrepreneur());
        agency.servePerson();

        agency.setPerson(new Child());
        agency.servePerson();

    }
}
