package DSA.HashTable;

import java.util.Hashtable;

public class StudentScoresManager {
    private final Hashtable<String, Integer> scores;

    public StudentScoresManager() {
        scores = new Hashtable<>();
    }

    // Method to add a student's score
    public synchronized void addScore(String name, int score) {
        scores.put(name, score);
    }

    // Method to get a student's score
    public synchronized Integer getScore(String name) {
        return scores.get(name);
    }

    // Method to remove a student's score
    public synchronized void removeScore(String name) {
        scores.remove(name);
    }

    // Method to print all student scores
    public synchronized void printScores() {
        System.out.println("Student Scores:");
        for (String studentName : scores.keySet()) {
            System.out.println(studentName + ": " + scores.get(studentName));
        }
    }

    public static void main(String[] args) {
        StudentScoresManager manager = new StudentScoresManager();

        // Adding some student scores
        manager.addScore("Alice", 85);
        manager.addScore("Bob", 92);
        manager.addScore("Charlie", 78);

        // Printing all student scores
        manager.printScores();

        // Getting and printing Bob's score
        System.out.println("Bob's score: " + manager.getScore("Bob"));

        // Removing Charlie's score
        manager.removeScore("Charlie");

        // Printing all student scores after removal
        manager.printScores();
    }
}
