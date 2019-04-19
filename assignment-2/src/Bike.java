public class Bike {
    // ATTRIBUTES
    private String owner;
    private String model;
    private int wheelDiameter;
    private int gears;
    private int kmsRidden;

    // CONSTRUCTORS
    // 1. Default
    public Bike() {

    }

    // 2. With Arguments
    public Bike(String owner, String model, int wheelDiameter, int gears, int kmsRidden) {
        this.owner = owner;
        this.model = model;
        this.wheelDiameter = wheelDiameter;
        this.gears = gears;
        this.kmsRidden = kmsRidden;
    }

    // GETTERS & SETTERS
    // 1. Owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 2. Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // 3. Wheel Diameter
    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    // 4. Gears
    public int getGears() {
        return gears;
    }

    // 5. Kilometres Ridden
    public int getKmsRidden() {
        return kmsRidden;
    }

    // METHODS
    // Bike|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>
    public String toString() {
        return "Bike|" + getOwner() + "|" + getModel() + "|" + getWheelDiameter() + "|" + getGears() + "|" + getKmsRidden();
    }

    // Bike = length of owner’s name * gears
    public int getServiceInterval() {
        return getOwner().length() * getGears();
    }
}