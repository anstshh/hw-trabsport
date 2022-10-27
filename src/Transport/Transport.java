package Transport;

public abstract class Transport {

    private String brand;
    private String model;
    private  int productionYear;
    private  String productionCountry;
    private String color;
    private int maxSpeed;
    private String fuel;

    public Transport(String brand, String model, int productionYear, String productionCountry, String fuel) {
        this(brand, model, productionYear, productionCountry, "Белый", 1000, fuel);

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = brand;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.fuel = fuel;

    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String fuel) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.maxSpeed = maxSpeed;
        }
        this.fuel = fuel;

    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if (fuel == null) {
            this.fuel = "default";
        } else {
            this.fuel = fuel;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null && brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null && model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public abstract void refill();

    protected abstract void refill(Boolean gasoline, Boolean diesel, Boolean electricity);
}