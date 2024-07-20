package Classes.Objects;

public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(" Name of the Student: "+ name+ " " + age+ " years old");

    }
}
 class StudentName{
    public static void main(String[] args) {

        Student student = new Student("Solomon", 38);

    }
}
