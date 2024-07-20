package DSA.HashSet;

import java.util.HashSet;

public class StudentManagementSystem {
    private final HashSet<Integer> studentIDs;

    public StudentManagementSystem() {
        studentIDs = new HashSet<>();
    }

    public void enrollStudent(int studentID) {
        if (studentIDs.contains(studentID)) {
            System.out.println("Student with ID " + studentID + " is already enrolled.");
        } else {
            studentIDs.add(studentID);
            System.out.println("Student with ID " + studentID + " has been enrolled successfully.");
        }
    }

    public void removeStudent(int studentID) {
        if (studentIDs.contains(studentID)) {
            studentIDs.remove(studentID);
            System.out.println("Student with ID " + studentID + " has been removed successfully.");
        } else {
            System.out.println("Student with ID " + studentID + " is not enrolled.");
        }
    }

    public boolean isStudentEnrolled(int studentID) {// getStudent
        return studentIDs.contains(studentID);
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        sms.enrollStudent(1001);
        sms.enrollStudent(1002);
        sms.enrollStudent(1003);

        System.out.println("Is student 1002 enrolled? " + sms.isStudentEnrolled(1002)); // Output: true
        System.out.println("Is student 1004 enrolled? " + sms.isStudentEnrolled(1004)); // Output: false

        sms.removeStudent(1002);

        System.out.println("Is student 1002 enrolled after removal? " + sms.isStudentEnrolled(1002)); // Output: false
    }
}
