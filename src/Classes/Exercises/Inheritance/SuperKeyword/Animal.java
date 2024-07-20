package Classes.Exercises.Inheritance.SuperKeyword;
// USES OF 'super' keyword in inheritance are: calling variable, method and constructor from superclass
public class Animal {
    String name = "Animal";
    String species;

    void makeSound(){
        System.out.println("Animals Make sound");
    }
    Animal(String species){
        this.species = species;
    }
}
class Dog extends Animal{
    String breed;
    String name = "Dog";
    @Override
    void makeSound() {
        super.makeSound();// calls method
        System.out.println(name+" makes WOOF! Woof! Sound");
    }
    void display(){
        System.out.println(super.name);// calls variable of superclass
        System.out.println("Animal Name is: "+name);
    }

    Dog(String species,String breed){
        super(species);// invokes constructor
        this.breed = breed;
    }

}
class DogMainDemo{
    public static void main(String[] args) {
        Dog myDog = new Dog("German Shepherd", "Dog");

        myDog.display();
        myDog.makeSound();
    }
}
