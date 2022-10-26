package Transport;

public class Bus  extends Transport{

    public String destination;
    private String statusRefill;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination != null) {
            this.destination = destination;
        } else {
            this.destination = "место назначения не указано";
        }
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed ) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, "Топливо");
    }

    @Override
    public void refill() {

    }

    @Override
    protected void refill (Boolean gasoline, Boolean diesel, Boolean electricity) {
        if (gasoline || diesel) {
            statusRefill = "заправлен";
        } else {
            statusRefill = "не заправлен";
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "destination='" + destination + '\'' +
                ", statusRefill='" + statusRefill + '\'' +
                '}';
    }
}
