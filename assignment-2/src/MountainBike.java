public class MountainBike extends Bike {
    // ATTRIBUTES
    private int suspensionDepth;

    // CONSTRUCTORS
    // 1. Default
    public MountainBike() {

    }

    // 2. Inherited
    public MountainBike(String owner, String model, int wheelDiameter, int gears, int kmsRidden, int suspensionDepth) {
        super(owner, model, wheelDiameter, gears, kmsRidden);
        this.suspensionDepth = suspensionDepth;
    }

    // GETTERS AND SETTERS
    public int getSuspensionDepth() {
        return suspensionDepth;
    }

    public void setSuspensionDepth(int suspensionDepth) {
        this.suspensionDepth = suspensionDepth;
    }

    // METHODS
    // MTB|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>|<suspensionDepth>
    public String toString() {
        return "MTB|" + super.getOwner() + "|" + super.getModel() + "|" + super.getWheelDiameter() + "|" + super.getGears() + "|" + super.getKmsRidden() + "|" + getSuspensionDepth();
    }

    // MountainBike = wheel diameter * gears – suspension depth
    public int getServiceInterval() {
        return super.getWheelDiameter() * super.getGears() - getSuspensionDepth();
    }
}