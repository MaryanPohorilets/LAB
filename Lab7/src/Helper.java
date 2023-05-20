import java.util.ArrayList;
import java.util.Random;

public class Helper {
    private ArrayList<Car> cars;

    public Helper(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Car getRandomCar() {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}