package DSA.HashMap;

import java.util.HashMap;

public class StudentDatabase {
    private final HashMap<Integer, Student> students;

    public StudentDatabase() {
        students = new HashMap<>();
    }

    public void addStudent(int studentID, String name, int age) {
        if (students.containsKey(studentID)) {
            System.out.println("Student with ID " + studentID + " already exists.");
        } else {
            Student newStudent = new Student(name, age);// creates new student object
            students.put(studentID, newStudent);
            System.out.println("Student with ID " + studentID + " has been added successfully.");
        }
    }

    public void removeStudent(int studentID) {
        if (students.containsKey(studentID)) {
            students.remove(studentID);
            System.out.println("Student with ID " + studentID + " has been removed successfully.");
        } else {
            System.out.println("Student with ID " + studentID + " does not exist.");
        }
    }

     Student getStudent(int studentID) {
        return students.get(studentID);
    }

    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();

        database.addStudent(1001, "Alice", 20);
        database.addStudent(1002, "Bob", 22);
        database.addStudent(1003, "Charlie", 21);


        System.out.println("Student with ID 1002: " + database.getStudent(1002)); // Output: Student{name='Bob', age=22}

        database.removeStudent(1003);

        System.out.println("Is student with ID 1003 in the database? " + database.getStudent(1003));
        // Output: null
        database.addStudent(1003,"Selam",30);
        System.out.println("Is student with ID 1003 in the database? " + database.getStudent(1003));
    }
}

class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='" + name + "', age=" + age + "}";
    }
}
