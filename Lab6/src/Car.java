public abstract class Car {
    String model;
    String color;
    int max_speed;

    public Car(String model, String color, int max_speed) {
        this.model = model;
        this.color = color;
        this.max_speed = max_speed;
    }

    void gas(){
        System.out.println("Газуємо!");
    }
    abstract void brake();
}
