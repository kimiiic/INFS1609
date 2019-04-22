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
    // indicates if bike was successfully created
    public boolean insertBike(String bikeString) {
        // come in the format:
        // Bike|<owner>|<model>|<wheelDiameter>|<gears>|<kmsRidden>
        String inputArray[] = bikeString.split("\\|");
        /*
        for ( String name : inputArray ){
            System.out.println(name);
        }*/

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

        /*
        // Request is for a Mountain Bike
        } else if(bikeType.equals("MTB")) {
            if(!bikeExists(owner, model) && (bikeShop.size()+1 <= maxBikes)) {
            // Insert it into the 'system', hashmap
                int suspensionDepth = Integer.parseInt(inputArray[6]);
                MountainBike mtb = new MountainBike(owner, model, wheelDiameter, gears, kmsRidden, suspensionDepth);
                bikeList.add(mtb);
                return true;
            }

        // Request is for a RoadBike
        } else if(bikeType.equals("RB")) {
            if(!bikeExists(owner, model) && (bikeShop.size()+1 <= maxBikes))  {
            // Insert it into the 'system', hashmap
                int reflectorsFitted = Integer.parseInt(inputArray[6]);
                RoadBike rb = new RoadBike(owner, model, wheelDiameter, gears, kmsRidden, reflectorsFitted);
                bikeList.add(rb);
                return true;
            }
        } /*

        // ELSE it's not a bike
        return false; // Object can't be created
     */

    // Returns whether or not a bike exists
    public boolean bikeExists(String owner, String model) {
        /*
        if(bikeShop.containsKey(owner)) { // Checks if the owner key exists in the HashMap
            if(model == bikeShop.get("owner")) { // Access the key and check if the model is the same
                return true; // If they're the same, then the bike exists
            }
        }*/
        return false; // Else it doesn't exist
    }

    // This should call the toString() method of each object
    public void printSystem() {
        for(Bike bike: bikeList) {
            System.out.println(bike); // and print it to the screen in the same format as the bikeString inputs
        }
    }

    public void closeShop() {
        // Empties the bikeShop
        bikeList.clear();
        //bikeShop.clear(); // Restore it to an empty state
    }

    public void printServiceIntervals() {
        for(Bike bike: bikeList) {
            System.out.println(bike.getOwner() + ", " + bike.getModel() + ", " + bike.getServiceInterval());
        }

        // owner, model, serviceInterval
    }
}
