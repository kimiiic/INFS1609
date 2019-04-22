import java.util.ArrayList;

public class TestBikeSystem{

    public static void main(String[] args){
        /* TEST DATA
        Bike|Emily|Spinner|14|0|1
        MTB|Kirstin|Explorer|26|10|200|120
        RB|Alexander|Roadster|27|12|100|5
        Bike|Caroline|Toddler|10|0|1
        MTB|Anthony|Reign|27|10|500|170
        RB|George|Thunder|29|7|1000|4
        Bike|Sharon|Alley|24|5|20
        MTB|Susan|Nomad|29|11|400|180
        RB|Micahel|Highway|26|15|750|4
         */

        BikeSystem sys = new BikeSystem(10);

        sys.insertBike("Bike|Emily|Spinner|14|0|1");
        sys.insertBike("MTB|Kirstin|Explorer|26|10|200|120");
        sys.insertBike("RB|Alexander|Roadster|27|12|100|5");

        sys.printSystem();
        sys.printServiceIntervals();
        //test.printSystem();
        //test.printServiceIntervals();


		/*
		Bike a = new Bike("Emily", "Spinner", 14, 2, 1);
		Bike b = new MountainBike("Kirstin", "Explorer", 26, 10, 200, 120);
		Bike c = new RoadBike("Alexander", "Roadster", 27, 12, 100, 5);
		Bike d = new Bike("Caroline", "Toddler", 10, 0, 1);
		Bike e = new MountainBike("Anthony", "Reign", 27, 10, 500, 170);
		Bike f = new RoadBike("George", "Thunder", 29, 7, 1000, 4);
		Bike g = new Bike("Sharon", "Alley", 24, 5, 20);
		Bike h = new MountainBike("Susan", "Nomad", 29, 11, 400, 180);
		Bike i = new RoadBike("Micahel", "Highway", 26, 15, 750, 4);

		ArrayList<Bike> biking = new ArrayList<>();
		
		biking.add(a);
		biking.add(b);
		biking.add(c);
		biking.add(d);
		biking.add(e);
		biking.add(f);
		biking.add(g);
		biking.add(h);
		biking.add(i);
			
		for(Bike yenni: biking) {
			System.out.println(yenni.toString());
		}
		*/
    }

}