package Transport;

    public abstract class Transport {
        final private String brand;
        final private String model;
        final private int productionYear;
        final private String productionCountry;
        private String color;
        private int maxSpeed;

        protected abstract void refill(Boolean gasoline, Boolean diesel, Boolean electricity);

        public void setColor(String color) {
            if (color != null) {
                this.color = color;
            } else {
                this.color = "Цвет не указан";
            }
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed <= 0) {
                this.maxSpeed = -1;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }

        @Override
        public String toString() {
            return "Transport{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", productionYear=" + productionYear +
                    ", productionCountry='" + productionCountry + '\'' +
                    ", color='" + color + '\'' +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }

        public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
            this.brand = brand;
            this.model = model;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
            this.color = color;
            this.maxSpeed = maxSpeed;


            public String getBrand () {
                return brand;
            }


            public String getModel () {
                return model;
            }

            public int getProductionYear () {
                return productionYear;
            }

            public String getProductionCountry () {
                return productionCountry;
            }

            public String getColor () {
                return color;
            }

            public int getMaxSpeed () {
                return maxSpeed;
            }

        }
    }

