package DSA.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

class Student {
    private String name;
    private LinkedList<Integer> scores;

    public Student(String name) {
        this.name = name;
        this.scores = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void addScore(int score) {
        scores.add(score);
    }

    public boolean removeScore(int score) {
        //return scores.remove(Integer.valueOf(score));
           Iterator<Integer> iterator = scores.iterator();
    while (iterator.hasNext()) {
        if (iterator.next() == score) {
            iterator.remove();
            return true; // Element found and removed
        }
    }
    return false; // Element not found
}


    public boolean containsScore(int score) {
        return scores.contains(score);
    }

    public int getScoreCount() {
        return scores.size();
    }

    public double calculateAverageScore() {
        if (scores.isEmpty())
            return 0;
        double total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / getScoreCount();// or total/sores.size();
    }

    @Override
    public String toString() {
        return ("Student name='" + name  +
        ", scores=" + scores);
    }
}

 class StudentScoresManagement {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        // Adding students
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));


        // Adding scores for each student
        students.get(0).addScore(85);
        students.get(0).addScore(90);
        students.get(1).addScore(75);
        students.get(1).addScore(80);
        students.get(2).addScore(95);
        students.get(2).addScore(88);

        // Printing information of all students
        for (Student student : students) {
            System.out.println(student.getName() + "'s scores: " + student);
            System.out.println(student.getName() + "'s average score: " + student.calculateAverageScore());
        }

        // Removing a score for Bob
        Student bob = students.get(1);
        bob.removeScore(75);

        System.out.println("Bob's scores after removing one: " + bob);

        // Searching for a score for Charlie
       // Student charlie = students.get(2);
       // int score = 88;// this is scoreToSearch
        System.out.println("Does Charlie have a score of " + 88 + "? " + students.get(2).containsScore(88));
    }
}
