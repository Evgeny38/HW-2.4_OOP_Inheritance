public class Car extends Transport {
    private double volumeDrive;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String seasonTyres;
    private String statusRefill;

    public double getVolumeDrive() {
        return volumeDrive;
    }

    public void setVolumeDrive(double volumeDrive) {
        if (volumeDrive <= 0 ) {
            this.volumeDrive = 1.5;
        }else {
            this.volumeDrive = volumeDrive;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null || !transmission.isEmpty() || !transmission.isBlank()) {
            this.transmission = transmission;
        }else{
            this.transmission =" не указано. " ;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        if (bodyType != null || !bodyType.isEmpty() || !bodyType.isBlank()) {
            this.bodyType = bodyType;
        }else{
            this.bodyType =" не указано. " ;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null || !registrationNumber.isEmpty() || !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        }else{
            this.registrationNumber =" не указано. " ;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0 ) {
            this.numberOfSeats = 5;
        }else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public String getSeasonTyres() {
        return seasonTyres;
    }

    public void setSeasonTyres(String seasonTyres) {
        if (seasonTyres != null || !seasonTyres.isEmpty() || !seasonTyres.isBlank()) {
            this.seasonTyres = seasonTyres;
        }else{
            this.seasonTyres =" не указано. " ;
        }
    }

    public Car(String brand, String model, int yearMade, String country, String color,
               int speedMax, double volumeDrive, String transmission, String bodyType,
               String registrationNumber, int numberOfSeats, String seasonTyres) {
        super(brand, model, yearMade, country, color, speedMax);
        this.volumeDrive = volumeDrive;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.seasonTyres = seasonTyres;
    }

    @Override
    protected void refill(boolean gasoline, boolean diezel, boolean elektro) {
        if (gasoline || diezel || elektro) {
            statusRefill = " заправлен ";
        }else {
            statusRefill = " не заправлен ";
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "объём двигателя : " + volumeDrive + ". " +
                "тип трансмиссии: " + transmission + ". " +
                "тип кузова : " + bodyType + ". " +
                "регистрационный номер : " + registrationNumber + ". " +
                "количество мест : " + numberOfSeats + ". " +
                "тип шин : " + seasonTyres + ". " + statusRefill;
    }

}
