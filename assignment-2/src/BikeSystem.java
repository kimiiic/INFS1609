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

import java.util.ArrayList;

public class BikeSystem {
    // ATTRIBUTES
    private static int maxBikes = 0;
    private static ArrayList<Bike> bikeList;

    // CONSTRUCTORS
    // 1. Default
    public BikeSystem() {
        bikeList = new ArrayList<>();
    }

    // 2. Specified
    public BikeSystem(int maxBikes) {
        this.maxBikes = maxBikes;
        bikeList = new ArrayList<>();
    }

    // METHODS
    // 1. insertBike(): Indicates if the bike was successfully created
    public boolean insertBike(String bikeString) {
        // come in the format:
        // Bike|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>
        String inputArray[] = bikeString.split("\\|");

        String bikeType = inputArray[0];
        String owner = inputArray[1];
        String model = inputArray[2];
        int wheelDiameter = Integer.parseInt(inputArray[3]);
        int gears = Integer.parseInt(inputArray[4]);
        int kmsRidden = Integer.parseInt(inputArray[5]);

        // If the request is for a "Bike"
        if (!bikeExists(owner, model) && (bikeList.size() + 1 <= maxBikes)) {
            if (bikeType.equals("Bike")) {
                // If it doesn't exist AND bike system not full: (TODO!!!!!!!!!!!!!!!!!!!!!!!)
                // Create a Bike Object
                Bike bike = new Bike(owner, model, wheelDiameter, gears, kmsRidden);

                bikeList.add(bike); // insert it into the ArrayList of bikes

            } else if (bikeType.equals("MTB")) {
                int suspensionDepth = Integer.parseInt(inputArray[6]);
                MountainBike bike = new MountainBike(owner, model, wheelDiameter, gears, kmsRidden, suspensionDepth);

                bikeList.add(bike); // insert it into the ArrayList of bikes

            } else if (bikeType.equals("RB")) {
                int reflectorsFitted = Integer.parseInt(inputArray[6]);
                RoadBike bike = new RoadBike(owner, model, wheelDiameter, gears, kmsRidden, reflectorsFitted);

                bikeList.add(bike); // insert it into the ArrayList of bikes
            }
            return true;
        }
        return false;
    }

    // Returns whether or not a bike exists
    public boolean bikeExists(String owner, String model) {
        // Goes through all the current bikes in the bikeList ArrayList
        for(Bike bike: bikeList) {
            if (bike.getOwner().equals(owner) && bike.getModel().equals(model)) { // Checks if the owner and model match
                System.out.println("NOPE, exists already");
                return true; // If any match perfectly, then the bike DOES exist
            }
        }
        return false; // else return false, because it doesn't exist
    }

    // This should call the toString() method of each object
    public void printSystem() {
        for(Bike bike: bikeList) {
            System.out.println(bike); // and print it to the screen in the same format as the bikeString inputs
        }
    }

    // Clears the current bikeList
    public void closeShop() {
        // Empties the bikeShop
        bikeList.clear(); // Restores the list to an empty state
    }

    // Prints the service interval calculation of the object
    public void printServiceIntervals() {
        for(Bike bike: bikeList) {
            // Format: owner, model, serviceInterval
            System.out.println(bike.getOwner() + ", " + bike.getModel() + ", " + bike.getServiceInterval());
        }
    }

}
