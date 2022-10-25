package Transport;

public class Bus  extends Transport{

    public Bus(String brand, String model, int productionYear, String productionCountry) {
        super(brand, model, productionYear, productionCountry,"Топливо");
    }

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed,"Топливо");
    }

    @Override
    public void refill() {
    }
}
