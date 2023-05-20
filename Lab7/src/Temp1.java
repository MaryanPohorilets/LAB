import java.util.ArrayList;

public class Temp1 {
    private ArrayList<Car> carList;
    Helper helper;

    public Temp1(ArrayList<Car> carList, Helper helper) {
        this.carList = carList;
        this.helper = helper;
    }

    public void solution(){
        for (int i = 0; i < carList.size(); i += 2) {
            Car car = carList.get(i);
            car.increasePower();
            car.increasePrice();
        }

        for (Car car : carList) {
            if (car.getDriver() != null) {
                if (car.getDriver().getDrivingExperience() < 5 && car.getDriver().getAge() > 25) {
                    car.getDriver().increaseExperience();
                }
            }
        }

        for (Car car : carList) {
            if (car.getDriver() != null) {
                System.out.println("Автомобіль марки " + car.getBrand() + " з водієм " + car.getDriver().getName() + " виїхав за вами.");
                System.out.println("Водій " + car.getDriver().getName() + " прибув на місце.");
            }
        }

        System.out.println("\n");

        Car randomCar = helper.getRandomCar();
        for (Car car : carList) {
            if (car.getDriver() != null) {
                System.out.println("Випадковий автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");
                System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
                break;
            }
        }
    }
}