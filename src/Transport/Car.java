package Transport;

import java.time.LocalDate;

public class Car extends Transport {

    public static class Key {
        private final boolean disStart;
        private final boolean keylessAccess;

        public Key(boolean disStart, boolean keylessAccess) {
            this.disStart = disStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isDisStart() {
            return disStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate insuranceValPer;
        private final double costInsurance;
        private final String numOfInsurance;

        public Insurance(LocalDate insuranceValPer, double costInsurance, String numOfInsurance) {
            if (insuranceValPer == null) {
                this.insuranceValPer = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValPer = insuranceValPer;
            }
            this.costInsurance = costInsurance;
            if (numOfInsurance == null) {
                this.numOfInsurance = "123456789";
            } else {
                this.numOfInsurance = numOfInsurance;
            }
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getInsuranceValPer() {
            return insuranceValPer;
        }

        public double getCostInsurance() {
            return costInsurance;
        }

        public String getNumOfInsurance() {
            return numOfInsurance;
        }

        public void checkExpireDate() {
            if (insuranceValPer.isBefore(LocalDate.now()) || insuranceValPer.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку! ");
            }
        }

        public void checkNumber() {
            if (numOfInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный! ");
            }
        }
    }

    private double engineVolume;
    private String gearBox;
    private final String body;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean tiresWinOrSum;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double engineVolume  ) {
        this(brand,
                model,
                productionYear,
                productionCountry,
                color,
                engineVolume,
                "MT",
                "SEDAN",
                "x000xx000",
                5,
                true,
                new Key(),
                new Insurance()

        );
    }

    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double engineVolume,
               String gearBox,
               String body,
               String registrationNumber,
               int numberOfSeats,
               boolean tiresWinOrSum,
               Key key,
               Insurance insurance) {

        super(brand, model, productionYear, productionCountry, color, 0, "Топлво");

        this.engineVolume = engineVolume;
        if (gearBox == null) {
            this.gearBox = "MT";
        } else {
            this.gearBox = gearBox;
        }
        if (body == null) {
            this.body = "Sedan";
        } else {
            this.body = body;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        this.numberOfSeats = numberOfSeats;
        this.tiresWinOrSum = tiresWinOrSum;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }


    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == null) {
            this.gearBox = "Введите значение";
        } else {
            this.gearBox = gearBox;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats == 0) {
            this.numberOfSeats = 000;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public boolean getTiresWinOrSum() {
        return tiresWinOrSum;
    }

    public void setTiresWinOrSum(boolean tiresWinOrSum) {
        this.tiresWinOrSum = tiresWinOrSum;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null) {
            this.registrationNumber = "Введите значение";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public void refill() {
        System.out.println("Топливо "+getFuel());
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electricity) {

    }

    public boolean isSummerTyres() {
        return tiresWinOrSum;
    }

    public void changeTyres() {
        tiresWinOrSum = !tiresWinOrSum;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

}