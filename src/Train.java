public class Train extends Transport{
    private double price;
    private double travelTime;
    private String departureStation;
    private String finalStation;
    private int numberOfWagons;
    private String statusRefill;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0 ) {
            this.price = 1000;
        }else {
            this.price = price;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime <= 0 ) {
            this.travelTime = 1;
        }else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation != null || !departureStation.isEmpty() || !departureStation.isBlank()) {
            this.departureStation = departureStation;
        }else{
            this.departureStation =" не указано. " ;
        }
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        if (finalStation != null || !finalStation.isEmpty() || !finalStation.isBlank()) {
            this.finalStation = finalStation;
        }else{
            this.finalStation =" не указано. " ;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons <= 0 ) {
            this.numberOfWagons = 1;
        }else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " цена поездки: " + price + " руб. " +
                "время пути: " + travelTime + " ч. " +
                "станция отправления: " + departureStation + ". " +
                "станция прибытия: " + finalStation + ". " +
                "число вагонов: " + numberOfWagons + ". "+ statusRefill;
    }

    public Train(String brand, String model, int yearMade,  String country, String color, int speedMax,
                 double price, double travelTime, String departureStation, String finalStation,
                 int numberOfWagons) {
        super(brand, model, yearMade, country, color  ,speedMax);
        this.price = price;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.finalStation = finalStation;
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    protected void refill(boolean gasoline, boolean diezel, boolean elektro) {
        if (diezel ) {
            statusRefill = " заправлен ";
        }else {
            statusRefill = " не заправлен ";
        }
    }
}
