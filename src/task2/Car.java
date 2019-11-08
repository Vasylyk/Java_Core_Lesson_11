package task2;

public class Car {
    private int horsePower;
    private int yearOfRelease;
    Wheel wheel;
    Engine engine;

    public Car(int horsePower, int yearOfRelease, Wheel wheel, Engine engine) {
        this.horsePower = horsePower;
        this.yearOfRelease = yearOfRelease;
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", yearOfRelease=" + yearOfRelease +
                ", wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }
}
