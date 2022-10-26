package Transport;

public class Car extends Transport {
    private String statusRefill;
    private final float engineVolume;

    public float getEngineVolume() {
        return engineVolume;}

    @Override
    protected void refill (Boolean gasoline, Boolean diesel, Boolean electricity ) {
        if (gasoline || diesel || electricity) {
            statusRefill = "заправлен";
        } else {
            statusRefill = "не заправлен";


        }
    }

    public Car (String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, float engineVolume) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, "Топливо");
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void refill() {

    }
}
