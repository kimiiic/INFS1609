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
        sys.insertBike("Bike|Emily|Spinner|14|0|1");
        //sys.printServiceIntervals();
        sys.printSystem();
        sys.closeShop();
        System.out.println("--------------Closed Shop!");
        sys.insertBike("Bike|Emily|Spinner|14|0|1");
        sys.printSystem();
    }

}