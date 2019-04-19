/*
The boolean will indicated whether the Bike was successfully created.
Returns
false if the bike already exists or the BikeSystem is full.

You will need to
parse these Strings and create objects from them
The bikeStrings will come in the following formats:
Bike|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>
MTB|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>|<suspensionDepth>
RB|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>|<reflectorsFitted>

public boolean bikeExists(String owner, String model)
This boolean will indicate whether the bike exists in the system or not
public void printSystem()
This should call the toString() method of each object and print it to the screen
in the same format as the bikeString inputs
public void closeShop()
This should empty the bikeShop and restore it to an empty state
public void printServiceIntervals()
This should print the list of bikes, and service intervals in the format:
owner, model, serviceInterval
*/

public class BikeSystem {
    private static int maxBikes = 0;
    private static int numBikes = 0;

    // CONSTRUCTORS
    // 1. Default
    public BikeSystem() {

    }

    // 2. Specified
    public BikeSystem(int maxBikes) {
        this.maxBikes = maxBikes;
    }

    // METHODS
    // indicates if bike was successfully created
    public boolean insertBike(String bikeString) {
        // bike succesfully created
        // calls object?

        // come in the format:
        // Bike|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>
        String names= "Jan/Albert|Bob";

        // | is a metacharacter in regex. You'd need to escape it:
		/*
		String[] ns = names.split("\\|");
		for ( String name : ns ){
			System.out.println(name);
		}*/

        String inputArray[] = bikeString.split("\\|");
        for ( String name : inputArray ){
            System.out.println(name);
        }

        if(inputArray[0].equals("Bike")) {
            System.out.print("YAY!");
            // call bike
            // if not == NULL
            //System.out.println(Integer.parseInt(inputArray[2]));
            //Bike a = new Bike(inputArray[0], inputArray[1], Integer.parseInt(inputArray[2]), Integer.parseInt(inputArray[3]), Integer.parseInt(inputArray[4]));
        } else if(inputArray[0].equals("MTB")) {
            System.out.print("2");
        } else if(inputArray[0].equals("RB")) {
            System.out.print("3");
        } else {
            return false;
        }

        // if bike already exists

        // or bike system is full
        return false;
    }

    public boolean bikeExists(String owner, String model) {
        // look up in the system
        return true;
    }

    // This should call the toString() method of each object
    public void printSystem() {
        System.out.println(toString()); // and print it to the screen in the same format as the bikeString inputs
    }

    public void closeShop() {

        // emptys the bikeshop
        // restore it to an empty state
    }

    public void printServiceIntervals() {
        System.out.print(", " + ", " + "yes");
        // owner, model, serviceInterval
    }
}
