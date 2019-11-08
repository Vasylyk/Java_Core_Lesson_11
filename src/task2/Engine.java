package task2;

public class Engine {
    private int numOfCylinders;

    public Engine(int numOfCylinders) {
        this.numOfCylinders = numOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numOfCylinders=" + numOfCylinders +
                '}';
    }
}
