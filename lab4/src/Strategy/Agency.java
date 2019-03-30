package Strategy;

public class Agency {
    private IPerson person;

    public void setPerson(IPerson person){
        this.person = person;
    }

    public  void servePerson(){
        System.out.println("\nServing person : ");
        person.apply();
        System.out.println("Applied!!!\n");
    }

}
