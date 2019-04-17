import java.util.ArrayList;

public class Tut8EX2 {

    public static void main(String[] args){
        Animal huMan = new Animal("hu man");
        Dog corgiDog = new Dog("corgi dog");
        Cat persianCat = new Cat("persian cat");

        // Declare an array list
        // Type ArrayList<Animal> box using the ArrayList constructor
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