package Transport;

public abstract class Train extends Transport {

    private int priceOfTrip;
    private int timeOfTrip;
    private String stationName;
    private String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int priceOfTrip, int timeOfTrip, String stationName, String finalStop, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, null, 0,"Топливо");
        setMaxSpeed(maxSpeed);
        if (priceOfTrip == 0) {
            this.priceOfTrip = 0000;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
        if (timeOfTrip == 0) {
            this.timeOfTrip = 12;
        } else {
            this.timeOfTrip = timeOfTrip;
        }
        if (stationName == null) {
            this.stationName = "Такой станции не существует";
        } else {
            this.stationName = stationName;
        }
        if (finalStop == null) {
            this.finalStop = "Такой конечной станции не существует";
        } else {
            this.finalStop = finalStop;
        }
        if (numberOfWagons == 0) {
            this.numberOfWagons = 1000;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public int getPriceOfTrip() {
        return priceOfTrip;
    }

    public int getTimeOfTrip() {
        return timeOfTrip;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {

    }
}