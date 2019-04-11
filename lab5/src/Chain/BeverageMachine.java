package Chain;

public class BeverageMachine {
    private WaterTank waterTank;

    public BeverageMachine() {
        this.waterTank = new WaterTank(1, new WaterTank(2, 100), 50);
         /* or :
         this.waterTank = new WaterTank(1, 50);
         this.waterTank.setNextWaterTank(new WaterTank(2, 100));
          */
    }

    public BeverageMachine(WaterTank waterTank) {
        this.waterTank = waterTank;
    }

    public void getCupOfCoffe() {
        if (waterTank.getWater(50)) {
            System.out.println("Please, get your cup of coffe. Have a nice day!\n");
        } else System.out.println("Technical problems, call the master!\n");
    }

    public void getCupOfTea() {
        if (waterTank.getWater(100)) {
            System.out.println("Please, get your cup of tea. Have a nice day!");
        } else System.out.println("Technical problems, call the master!");
    }
}
