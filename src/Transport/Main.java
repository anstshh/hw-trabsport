package Transport;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car lada = new Car("Lada ", "Grande", 2015, "России", "желтого", 1.7);
        lada.setRegistrationNumber("в145уо123");
        System.out.println(lada.isCorrectRegNumber());

        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии", "черный ", 3.0);
        audi.setGearBox("AT");
        audi.setTiresWinOrSum(false);
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "54231349"));
        audi.getInsurance().checkExpireDate();
        audi.getInsurance().checkNumber();
        audi.setFuel("Дизель");

        Car bmw = new Car("BMW ", "Z8", 2021, "Германии", "черный ", 3.0);
        bmw.setTiresWinOrSum(false);
        bmw.setKey(new Car.Key(true, true));
        bmw.setFuel("Электро");

        Car kia = new Car("Kia ", "Sportage 4 поколение", 2018, "Южной Корее", "красный ", 2.4);
        Car hyundai = new Car("Hyundai ", "Avante", 2016, "Южной Корее", "оранжевый ", 1.6);

        System.out.println();
        printInfoCar(lada);
        printInfoCar(audi);
        printInfoCar(bmw);
        printInfoCar(kia);
        printInfoCar(hyundai);

        System.out.println();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println();
        printInfoTrain(lastochka);
        printInfoTrain(leningrad);

        System.out.println();

        Bus ekarus = new Bus("Экарус", "В-52", 1991, "Россия", "Красный", 150);
        Bus luaz = new Bus("Луаз", "Ли-2", 1984, "Россия", "Желтый", 100);
        Bus pazik = new Bus("Пазик", "ПА-2", 1981, "Россия", "Белый", 120);

        System.out.println();
        printInfoBus(ekarus);
        printInfoBus(luaz);
        printInfoBus(pazik);

    }

    public static void printInfoCar(Car car) {
        System.out.println(
                car.getBrand() + " " + car.getModel() +
                        ", год выпуска " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() +
                        ", цвет кузова " + car.getColor() +
                        ", обьем двигателя " + car.getEngineVolume() +
                        ", коробка передач - " + car.getGearBox() +
                        ", тип кузова - " + car.getBody() +
                        ", рег.номер - " + car.getRegistrationNumber() +
                        ", кол-во мест - " + car.getNumberOfSeats() +
                        ",  " + (car.isSummerTyres() ? "летняя" : "зимняя") + "резина" +
                        ", " + (car.getKey().isKeylessAccess() ? "безключевой доступ" : "ключевой") +
                        ", " + (car.getKey().isDisStart() ? "удаленный запуск" : "не удаленный запуск") +
                        ", номер страховки: " + car.getInsurance().getNumOfInsurance() +
                        ", стоимость страховки: " + car.getInsurance().getCostInsurance() +
                        ", срок действия страховки: " + car.getInsurance().getInsuranceValPer()+
                        ", топливо: "+car.getFuel()
        );
    }

    public static void printInfoTrain(Train train) {
        System.out.println(
                train.getBrand() + " " + train.getModel() +
                        ", год выпуска " + train.getProductionYear() +
                        ", страна сборки " + train.getProductionCountry() +
                        ", скорость передвижения -  " + train.getMaxSpeed() +
                        ", цена проезда - " + train.getPriceOfTrip() +
                        ", отходит от - " + train.getStationName() +
                        ", следует до - " + train.getFinalStop() +
                        ", в поезде - " + train.getNumberOfWagons() + " вагонов."
        );
    }

    public static void printInfoBus(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() +
                        ", год выпуска " + bus.getProductionYear() +
                        ", страна сборки " + bus.getProductionCountry() +
                        ", скорость передвижения -  " + bus.getMaxSpeed() +
                        ", цвет - " + bus.getColor() +
                        ", скорость - " + bus.getMaxSpeed()
        );
    }
}