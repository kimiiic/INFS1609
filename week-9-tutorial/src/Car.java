public class Car extends Vehicle {
    // ATTRIBUTES
    private int setCapacity;

    // CONSTRUCTORS
    public Car() {

    }

    public Car(int wheels, String motor, int setCapacity) {
        super(wheels, motor);
        this.setCapacity = setCapacity;
    }

    // GETTERS & SETTERS
    public int getSetCapacity() {
        return setCapacity;
    }

    public void setSetCapacity(int setCapacity) {
        this.setCapacity = setCapacity;
    }

    // METHODS
    public void start() {
        System.out.println("rumble");
    }
}