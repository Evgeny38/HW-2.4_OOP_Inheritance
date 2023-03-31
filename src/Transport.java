public abstract class Transport {
    final private String brand;
    final private String model;
    final private int yearMade;
    final private String country;
    private String color;
    private int speedMax;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setColor(String color) {
        if (color != null || !color.isEmpty() || !color.isBlank()) {
            this.color = color;
        }else{
            this.color =" Цвет не указан. " ;
        }
    }
    public void setSpeedMax(int speedMax) {
        if (speedMax <= 0) {
            this.speedMax = 1;
        }else {
            this.speedMax = speedMax;
        }
    }

    protected Transport(String brand, String model, int yearMade, String country, String color, int speedMax) {
        this.brand = brand;
        this.model = model;
        this.yearMade = yearMade;
        this.country = country;
        this.color = color;
        this.speedMax = speedMax;
    }

    protected abstract void refill(boolean gasoline, boolean diezel, boolean elektro);

    @Override
    public String toString() {
        return  " марка: " + brand + ". " +
                " модель: " + model + ". " +
                " год выпуска: " + yearMade +
                " страна производства: " + country + ". " +
                " цвет кузова: " + color + ". " +
                " макс скорость: " + speedMax + " км/ч. ";
    }
}
