public abstract class Vehicle {
    // ATTRIBUTES
    private int wheels;
    private String motor;

    // CONSTRUCTORS
    // 1. Default
    public Vehicle() {

    }

    public Vehicle(int wheels, String motor) {
        this.wheels = wheels;
        this.motor = motor;
    }

    // GETTERS & SETTERS
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor() {
        this.motor = motor;
    }

    // METHODS
    // 1. Abstract method - returns no values
    public abstract void start();
}