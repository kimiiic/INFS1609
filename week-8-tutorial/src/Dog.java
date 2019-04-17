public class Dog extends Animal {
    // NO additional attributes

    // CONSTRUCTORS
    // 1. Default
    public Dog() {

    }

    // 2. With arguments (name)
    public Dog(String name) {
        super(name);
    }

    // METHODS
    // 1. makeSound() overrides the Animal class to print a dog sound
    @Override
    public void makeSound() {
        System.out.println(super.getName() + " says woof");
    }
}