public class Cat extends Animal {
    // CONSTRUCTORS
    // 1. Default
    public Cat() {

    }

    // 2. With arguments (name)
    public Cat(String name) {
        super(name);
    }


    // METHODS
    // 1. makeSound() overrides Animal to print cat sounds
    @Override
    public void makeSound() {
        System.out.println(super.getName() + " says meow");
    }
}