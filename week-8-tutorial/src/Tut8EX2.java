import java.util.ArrayList;

public class Tut8EX2 {

    public static void main(String[] args){
        Animal human = new Animal("human");
        Dog corgi = new Dog("corgi");
        Cat persian = new Cat("persian");

        // Declare an array list
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        // add your test animal objects here
        animalArrayList.add(human);
        animalArrayList.add(corgi);
        animalArrayList.add(persian);

        // test makeSound
        for (Animal a: animalArrayList){
            a.makeSound();
        }
    }

}