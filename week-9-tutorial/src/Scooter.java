public class Scooter extends Vehicle {
    // ATTRIBUTES
    private int batteryCapacity;

    // CONSTRUCTORS
    public Scooter() {

    }

    public Scooter(int wheels, String motor, int batteryCapacity) {
        super(wheels, motor);
        this.batteryCapacity = batteryCapacity;
    }

    // GETTERS & SETTERS
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity() {
        this.batteryCapacity = batteryCapacity;
    }

    // METHODS
    public void start() {
        System.out.println("beep");
    }
}