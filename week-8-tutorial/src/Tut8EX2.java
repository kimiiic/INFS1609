import java.util.ArrayList;

public class Tut8EX2 {

    public static void main(String[] args){
        Animal huMan = new Animal("human");
        Dog corgiDog = new Dog("corgi");
        Cat persianCat = new Cat("persian");

        // Declare an array list
        ArrayList<Animal> animalArrayList = new ArrayList<>();

        // Add your test animal objects here
        animalArrayList.add(huMan);
        animalArrayList.add(corgiDog);
        animalArrayList.add(persianCat);

        // Test makeSound() Polymorphism
        for (Animal a: animalArrayList){
            a.makeSound();
        }
    }

}