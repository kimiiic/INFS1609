public class Animal {
    private String name;

    // CONSTRUCTORS
    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    // METHODS
    // 1. makeSound() prints the statement for all animals
    public void makeSound() {
        System.out.println(getName() + " is an animal");
    }

    // GETTERS AND SETTERS
    // 1. Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}