public class Bus extends Transport{
    private String statusRefill;
    @Override
    public String toString() {
        return super.toString() + statusRefill;
    }

    public Bus(String brand, String model, int yearMade, String country, String color, int speedMax) {
        super(brand, model, yearMade, country, color, speedMax);
    }

    @Override
    protected void refill(boolean gasoline, boolean diezel, boolean elektro) {
        if (gasoline || diezel) {
            statusRefill = " заправлен ";
        }else {
            statusRefill = " не заправлен ";
        }

    }

}
