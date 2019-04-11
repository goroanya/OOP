package Chain;

public class WaterTank implements WaterSourse {
    private int id;
    private WaterTank nextWaterTank;
    private int waterCapacity;

    public int getId() {
        return id;
    }

    public WaterTank(int id, WaterTank nextWaterTank, int capacity) {
        this.id = id;
        this.nextWaterTank = nextWaterTank;
        this.waterCapacity = capacity;
    }

    public WaterTank(int id, int capacity) {
        this.id = id;
        this.waterCapacity = capacity;
    }

    public void setNextWaterTank(WaterTank nextWaterTank) {
        if (this.nextWaterTank == null) this.nextWaterTank = nextWaterTank;
        else System.out.println("The next water tank is set. It's id: #" + nextWaterTank.getId());
    }

    @Override
    public boolean getWater(int volume) {

        if (waterCapacity <= 0 || waterCapacity < volume) {
            if (nextWaterTank == null) {
                System.out.println("The water is over.");
                return false;
            } else {
                return nextWaterTank.getWater(volume);
            }
        }
        waterCapacity -= volume;
        System.out.println("Getting water from tank #" + id);
        return true;

    }
}
