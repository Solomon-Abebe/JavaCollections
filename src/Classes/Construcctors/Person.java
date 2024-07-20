package Classes.Construcctors;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of Person using the constructor
        Person person1 = new Person("John", 25);

        person1.name = " Solomon";
        person1.age = 38;

        System.out.println("Person is:" + person1.name +" "+ person1.age);

        // Using getters to retrieve values
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Using setters to modify values
        person1.setName("Jane");
        person1.setAge(30);

        // Displaying updated values using getters
        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());
    }
}