public class Tut9EX1{

    public static void main(String[] args){
        // DONT WORK cause abstract
        // Vehicle v = new Vehicle(1, "YES");

        Scooter scoot = new Scooter(1, "Yay", 3);
        scoot.start();
        Car cr = new Car(5, "B", 3);
        cr.start();
    }

}