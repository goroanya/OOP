package Chain;

public class Main {
    public static void main(String[] args) {
        BeverageMachine machine = new BeverageMachine();// default capacity of water: 150

        machine.getCupOfCoffe(); // 50
        machine.getCupOfCoffe(); // 50
        machine.getCupOfCoffe(); // 50
        machine.getCupOfCoffe(); // 50

    }
}
