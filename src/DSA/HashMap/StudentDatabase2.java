package DSA.HashMap;

import java.util.HashMap;

public class StudentDatabase2 {
    private final HashMap<Integer, Student2> students;

    public StudentDatabase2() {
        // Initialize the HashMap in the constructor
        students = new HashMap<>();
    }

    public void addStudent(int id, Student2 student) {
        students.put(id, student);
    }

    public Student2 getStudent(int id) {
        return students.get(id);
    }

    public static void main(String[] args) {
        // Create a new StudentDatabase instance
        StudentDatabase2 database = new StudentDatabase2();

        // Add some students to the database
        database.addStudent(1, new Student2("Alice", 12));
        database.addStudent(2, new Student2("Bob", 11));

        // Retrieve a student from the database
        Student2 student = database.getStudent(1);


        System.out.println("Student ID " + "&" + ", Name: " + student);
    }

   public static class Student2 {// inner class is static
        private final String name;
        private final int age;

        public Student2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{name='" + name + "', age=" + age + "}";
        }
    }
}
