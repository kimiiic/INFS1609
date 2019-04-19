public class RoadBike extends Bike {
    private int reflectorsFitted;

    // CONSTRUCTORS
    // 1. Default
    public RoadBike() {

    }

    // 2. Inherited
    public RoadBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int reflectorsFitted) {
        super(owner, model, wheelDiameter, gears, kmsRidden);
        this.reflectorsFitted = reflectorsFitted;
    }

    // GETTERS AND SETTERS
    // 1. reflectorsFitted
    public int getReflectorsFitted() {
        return reflectorsFitted;
    }

    public void setReflectorsFitted(int reflectorsFitted) {
        this.reflectorsFitted = reflectorsFitted;
    }

    // METHODS
    // RB|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>|<reflectorsFitted>
    public String toString() {
        return "RB|" + super.getOwner() + "|" + super.getModel() + "|" + super.getWheelDiameter() + "|" + super.getGears() + "|" + super.getKmsRidden() + "|" + getReflectorsFitted();
    }

    //RoadBike = kms ridden * reflectors fitted
    public int getServiceInterval() {
        return super.getKmsRidden() * getReflectorsFitted();
    }
}